package ru.job4j.poly;

public class Bus implements Transport, Vehicle {

    @Override
    public void move() {
        System.out.println("A bus moving along the highway");
    }

    @Override
    public void drive() {
        System.out.println("Drive");
    }

    @Override
    public void passengers(int passenger) {
        System.out.println("passengers");
    }

    @Override
    public int refuel(int fuel) {
        System.out.println("full");
        return fuel;
    }
}