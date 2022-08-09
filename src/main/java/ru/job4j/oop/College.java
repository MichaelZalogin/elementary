package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student student = freshman;
        Object object = freshman;
        Student freshman2 = new Freshman();
        Object freshman3 = new Freshman();
    }
}