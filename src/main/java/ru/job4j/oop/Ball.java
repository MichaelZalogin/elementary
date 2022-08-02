package ru.job4j.oop;

public class Ball {
    public void tryRun(boolean condition) {
        if (condition == true) {
            System.out.println("Ball was eaten");
        } else {
            System.out.println("Ball ran away");
        }
    }
}