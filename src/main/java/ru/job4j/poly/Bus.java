package ru.job4j.poly;

public class Bus implements Transport, Vehicle {

    @Override
    public void move() {
        System.out.println("A bus moving along the highway");
    }

    @Override
    public void drive() {

    }

    @Override
    public void passengers(int passenger) {

    }

    @Override
    public double refuel(int fuel) {
        return 0;
    }
}