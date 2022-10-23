package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class SmartphoneTest {
    Smartphone index1 = new Smartphone(10, "Телефон", 10000, "C30 4/64 ГБ", "Realme");
    Smartphone index2 = new Smartphone(11, "Телефон", 20000, "9A 2/32 ГБ", "Xiaomi Redmi");
    Smartphone index3 = new Smartphone(12, "Телефон", 15000, "A13 4/64 ", "Samsung Galaxy");

    @Test
    public void test1() {
        SmartphoneRepository repo = new SmartphoneRepository();
        repo.saveSmartphone(index1);
        repo.saveSmartphone(index2);
        repo.saveSmartphone(index3);

        Smartphone[] expected = {index1, index2, index3};
        Smartphone[] actual = repo.getSmartphone();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        SmartphoneRepository repo = new SmartphoneRepository();
        repo.saveSmartphone(index1);
        repo.saveSmartphone(index2);
        repo.saveSmartphone(index3);
        repo.removalSmartphone(index3.getId());

        Product[] expected = {index1, index2};
        Product[] actual = repo.getSmartphone();

        Assertions.assertArrayEquals(expected, actual);
    }
}
