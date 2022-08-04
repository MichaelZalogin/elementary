package ru.job4j.pojo;

import java.time.LocalDate;

public class Student {
    private String surname;
    private int group;
    private LocalDate dateOfEntrance;

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGroup() {
        return this.group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public LocalDate getDateOfEntrance() {
        return this.dateOfEntrance;
    }

    public void setDateOfEntrance(LocalDate dateOfEntrance) {
        this.dateOfEntrance = dateOfEntrance;
    }
}