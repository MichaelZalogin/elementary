package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean result = true;
        char[] symbols = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {
            if (!(isSpecialSymbol(symbols[i])
                    || isUpperLatinLetter(symbols[i])
                    || isLowerLatinLetter(symbols[i])
                    || Character.isDigit(symbols[i]))
                    && isLowerLatinLetter(symbols[0])) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code > 64 && code < 91;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code > 96 && code < 123;
    }
}