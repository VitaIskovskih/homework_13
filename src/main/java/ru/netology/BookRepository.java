package ru.netology;

public class BookRepository {
    Book[] product = new Book[0];

    public void saveBook(Book growth) {
        Book extra[] = new Book[product.length + 1];
        for (int i = 0; i < product.length; i++) {
            extra[i] = product[i];
        }
        extra[extra.length - 1] = growth;
        product = extra;
    }

    public void removalBook(int id) {
        Book[] extra = new Book[product.length - 1];
        int copyToIndex = 0;
        for (Book growth : product) {
            if (growth.getId() != id) {
                extra[copyToIndex] = growth;
                copyToIndex++;
            }
        }
        product = extra;
    }

    public Book[] getBook() {
        return product;
    }
}
