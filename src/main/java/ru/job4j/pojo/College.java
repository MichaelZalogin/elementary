package ru.job4j.pojo;

import java.time.LocalDate;
import java.time.Month;

public class College {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setSurname("Ivanov");
        student1.setGroup(13321);
        student1.setDateOfEntrance(LocalDate.of(2016, Month.SEPTEMBER, 01));
        System.out.println("Студент " + student1.getSurname() + " из группы №" + student1.getGroup() + " начал обучение " + student1.getDateOfEntrance());
    }
}