package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class BookTest {
    Book index1 = new Book(10, "Книга", 800, "Каменный грот", "Михаил Красновский");
    Book index2 = new Book(11, "Книга", 2000, "Инциклопедия", "Михаил Красновский");
    Book index3 = new Book(12, "Книга", 1500, "Роман", "Михаил Красновский");

    @Test
    public void testAddProducts() {
        BookRepository repo = new BookRepository();
        repo.saveBook(index1);
        repo.saveBook(index2);
        repo.saveBook(index3);

        Product[] expected = {index1, index2, index3};
        Product[] actual = repo.getBook();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testDeleteProducts() {
        BookRepository repo = new BookRepository();
        repo.saveBook(index1);
        repo.saveBook(index2);
        repo.saveBook(index3);
        repo.removalBook(index3.getIdBook());

        Product[] expected = {index1, index2};
        Product[] actual = repo.getBook();

        Assertions.assertArrayEquals(expected, actual);
    }
}
