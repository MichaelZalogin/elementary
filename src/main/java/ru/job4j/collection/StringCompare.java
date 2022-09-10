package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = Integer.compare(left.length(), right.length());
        int length = left.length() < right.length() ? left.length() : right.length();
        for (int i = 0; i < length; i++) {
            int character = Character.compare(left.charAt(i), right.charAt(i));
            if (character != 0) {
                rsl = character;
                break;
            }
        }
        return rsl;
    }
}