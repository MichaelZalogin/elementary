package ru.job4j.ex;

public class UserNotFoundException extends Exception {
    UserNotFoundException(String message) {
        super(message);
    }
}