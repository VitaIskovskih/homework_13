package ru.netology;

public class Book extends Product {
    private String denomination;
    private String author;

    public Book(int id, String name, int price, String denomination, String author) {
        super(id, name, price);
        this.denomination = denomination;
        this.author = author;
    }
    public int getIdBook() {
        return id;
    }
}
