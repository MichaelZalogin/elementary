package ru.job4j.map;

import java.util.*;

public class AnalyzeByMap {

    public static double averageScore(List<Pupil> pupils) {
        int count = 0;
        double grade = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                grade += subject.score();
                count++;
            }
        }
        return grade / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double count = 0;
            double grade = 0;
            for (Subject subject : pupil.subjects()) {
                grade += subject.score();
                count++;
            }
            labels.add(new Label(pupil.name(), grade / count));
        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                if (lhm.containsKey(subject.name())) {
                    lhm.put(subject.name(), lhm.get(subject.name()) + subject.score());
                } else {
                    lhm.putIfAbsent(subject.name(), subject.score());
                }
            }
        }
        for (String key : lhm.keySet()) {
            int value = lhm.get(key);
            labels.add(new Label(key, value / pupils.size()));
        }
        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double grade = 0;
            for (Subject subject : pupil.subjects()) {
                grade += subject.score();
            }
            labels.add(new Label(pupil.name(), grade));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                if (lhm.containsKey(subject.name())) {
                    lhm.put(subject.name(), lhm.get(subject.name()) + subject.score());
                } else {
                    lhm.put(subject.name(), subject.score());
                }
            }
        }
        for (String key : lhm.keySet()) {
            int value = lhm.get(key);
            labels.add(new Label(key, value));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }
}