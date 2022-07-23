package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            counter = i * counter;
        }
        return counter;
    }
}