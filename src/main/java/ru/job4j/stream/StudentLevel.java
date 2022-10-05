package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentLevel {
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .filter(st -> st != null)
                .sorted((left, right) -> ((Integer) (right.getScore())).compareTo(left.getScore()))
                .takeWhile(st -> st.getScore() > 20)
                .collect(Collectors.toList());
    }
}