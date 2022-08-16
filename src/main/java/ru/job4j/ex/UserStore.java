package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User tmp = null;
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                tmp = user;
                break;
            }
        }
        if (tmp == null) {
            throw new UserNotFoundException("User not found");
        }
        return tmp;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("User invalid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ui) {
            ui.getMessage();
            ui.printStackTrace();
        } catch (UserNotFoundException unf) {
            unf.getMessage();
            unf.printStackTrace();
        }
    }
}