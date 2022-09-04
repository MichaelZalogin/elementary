package ru.job4j.bank;

import java.util.*;
import java.util.List;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null && !users.get(user).contains(account)) {
            users.get(user).add(account);
        }
    }

    public User findByPassport(String passport) {
        User tmp = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                tmp = user;
            }
        }
        return tmp;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        Account tmp = null;
        if (user != null) {
            for (Account account : users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    tmp = account;
                    break;
                }
            }
        }
        return tmp;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account sender = findByRequisite(srcPassport, srcRequisite);
        Account payee = findByRequisite(destPassport, destRequisite);
        if (sender != null && payee != null && sender.getBalance() >= amount) {
            payee.setBalance(payee.getBalance() + amount);
            sender.setBalance(sender.getBalance() - amount);
            rsl = true;
        }
        return rsl;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}