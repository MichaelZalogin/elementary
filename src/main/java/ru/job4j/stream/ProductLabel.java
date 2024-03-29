package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class ProductLabel {
    public List<String> generateLabels(List<Product> products) {
        return products.stream()
                .filter(el -> el.getStandard() - el.getActual() < 4)
                .filter(el -> el.getStandard() - el.getActual() >= 0)
                .map(el -> new Label(el.getName(), (el.getPrice()) / 2))
                .map(Label::toString)
                .collect(Collectors.toList());
    }
}