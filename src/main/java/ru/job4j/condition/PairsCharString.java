package ru.job4j.condition;

public class PairsCharString {
    public static boolean check(String l, String r) {
        if (l.isEmpty() && r.isEmpty()) {
            return true;
        }
        if (l.charAt(0) == r.charAt(r.length() - 1)) {
            return true;
        }
        return false;
    }
}