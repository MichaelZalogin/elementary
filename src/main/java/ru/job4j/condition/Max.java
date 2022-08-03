package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int third) {
        int tmp = max(first, second);
        if (tmp > third) {
            return tmp;
        }
        return third;
    }
}