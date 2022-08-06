package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Name1", 23);
        Book book2 = new Book("Name2", 54);
        Book book3 = new Book("Name3", 64);
        Book book4 = new Book("Clean Code", 21);
        Book[] books = {book1, book2, book3, book4};
        for (int i = 0; i < books.length; i++) {
            Book tmp = books[i];
            System.out.println("Name book: " + tmp.getName() + ", page count = " + tmp.getPageCount());
        }
        Book book5 = book1;
        books[0] = books[3];
        books[3] = book1;
        for (int i = 0; i < books.length; i++) {
            Book tmp = books[i];
            System.out.println("Name book: " + tmp.getName() + ", page count = " + tmp.getPageCount());
        }
        for (int i = 0; i < books.length; i++) {
            Book tmp = books[i];
            if ("Clean Code".equals(tmp.getName())) {
                System.out.println("Name book: " + tmp.getName() + ", page count = " + tmp.getPageCount());
            }
        }
    }
}