package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class ProductManagerTest {
    Product index1 = new Product(10, "Книга", 800);
    Product index2 = new Product(11, "Телефон", 2000);
    Product index3 = new Product(12, "Книга", 1500);

    @Test
    public void test1() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        manager.add(index1);
        manager.add(index2);
        manager.add(index3);

        Product[] expected = {index1, index3};
        Product[] actual = manager.searchBy("Книга");

        Assertions.assertArrayEquals(expected, actual);
    }

}
