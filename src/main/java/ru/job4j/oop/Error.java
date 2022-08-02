package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void showInfo() {
        System.out.println("Состояние: " + this.active);
        System.out.println("Номер строки: " + this.status);
        System.out.println("Сообщение: " + this.message);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 12, "Array Index Out Of Bounds Exception");
        error.showInfo();
    }
}
