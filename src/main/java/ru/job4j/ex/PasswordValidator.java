package ru.job4j.ex;

import java.util.Set;

public class PasswordValidator {

    public static boolean findUpperSymbol(String upperValidate) {
        for (int i = 0; i < upperValidate.length(); i++) {
            char tmp = upperValidate.charAt(i);
            if (Character.isUpperCase(tmp)) {
                return true;
            }
        }
        return false;
    }

    public static boolean findLowerSymbol(String lowerValidate) {
        for (int i = 0; i < lowerValidate.length(); i++) {
            char tmp = lowerValidate.charAt(i);
            if (Character.isLowerCase(tmp)) {
                return true;
            }
        }
        return false;
    }

    public static boolean findDigits(String digitsValidate) {
        for (int i = 0; i < digitsValidate.length(); i++) {
            char tmp = digitsValidate.charAt(i);
            if (Character.isDigit(tmp)) {
                return true;
            }
        }
        return false;
    }

    public static boolean findPrimitivePass(String primitivePassword) {
        primitivePassword = primitivePassword.toLowerCase();
        String[] primitiveCombination = {"qwerty", "12345", "password", "admin", "user"};
        for (int i = 0; i < primitiveCombination.length; i++) {
            if (primitivePassword.contains(primitiveCombination[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean findSpecialSymbols(String specialValidate) {
        Set<Character> allowedCharacter = Set.of('(', ')', '-', '!', '?', '#', '@', '*', ']', '[');
        for (int i = 0; i < specialValidate.length(); i++) {
            char tmp = specialValidate.charAt(i);
            if (allowedCharacter.contains(tmp)) {
                return true;
            }
        }
        return false;
    }

    public static String validate(String password) {

        if (password == null) {
            throw new IllegalArgumentException();
        }

        if (password.length() > 33 || password.length() < 7) {
            return "Длина пароля должна находится в диапазоне от 8 до 32 символов";
        }

        if (!findUpperSymbol(password)) {
            return "Пароль должен содержать хотя бы один символ в верхнем регистре";
        }

        if (!findLowerSymbol(password)) {
            return "Пароль должен содержать хотя бы один символ в нижнем регистре";
        }

        if (!findDigits(password)) {
            return "Пароль должен содержать хотя бы одну цифру";
        }

        if (!findSpecialSymbols(password)) {
            return "Пароль должен содержать хотя бы один специальный символ";
        }

        if (findPrimitivePass(password)) {
            return "Пароль не должен содержать в себе простые пароли";
        }

        return password;
    }
}