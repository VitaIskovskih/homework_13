package ru.netology;

public class NotFoundException extends RuntimeException {

    public NotFoundException (int id) {
        super("Товар с таким id" + id + "не найден");
    }
}
