package ru.job4j.bank;

import java.util.*;
import java.util.List;

/**
 * Класс описывает работу банковской системы.
 *
 * @author MICHAEL ZALOGIN
 * @version 1.0
 */
public class BankService {
    /**
     * Поле системы задается справачником, где в качестве ключа передается пользователь {@link User}
     * со списком его аккаунтов {@link Account}.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавляет нового пользователя в справочник, если дубликаты отсутствуют
     * @param user
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Добавляет новый аккаунт пользователя в список. Выполняется в двух условиях:
     * 1. Если такой пользователь существует {@link #findByPassport(String)}
     * 2. Если такой аккаунт отсутствует.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null && !users.get(user).contains(account)) {
            users.get(user).add(account);
        }
    }

    /**
     * Поиск пользователя в справочнике по номеру его паспорта.
     * @param passport в параметры принимает номер паспорта пользователя.
     * @return возвращает найденого User или null если пользователь не найден.
     */
    public User findByPassport(String passport) {
        User tmp = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                tmp = user;
                break;
            }
        }
        return tmp;
    }

    /**
     * Поиск аккаунта пользователя по его реквизитам.
     * @param passport  в параметры принимает номер паспорта пользователя
     * @param requisite и реквизиты его счета
     * @return возвращает найденый Ассount пользователя или null если аккаунта не существует.
     */
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

    /**
     * Осуществляет денежный перевод между двумя пользователями.
     * @param amount отражает сумму перевода.
     *               Возможность перевода определяется наличием аккаунтов {@link #findByRequisite(String, String)}
     *               и наличием необходимой суммы на счете.
     */
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

    /**
     * @param user
     * @return Возвращает список всех аккаунтов пользователя
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}