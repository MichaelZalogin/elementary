package ru.job4j.poly;

public class Plane implements Vehicle {

    @Override
    public void move() {
        System.out.println("A plane flying through the air");
    }

    public static void main(String[] args) {
        Vehicle train = new Train();
        Vehicle plane = new Plane();
        Vehicle bus = new Bus();
        Vehicle[] vehicles = {train, plane, bus};
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}