package ru.job4j.pojo;

public class Book {
    private String name;
    private int pageCount;

    public Book(String name, int pageCount) {
        this.name = name;
        this.pageCount = pageCount;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}