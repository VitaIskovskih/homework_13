package ru.netology;

public class SmartphoneRepository {
    Smartphone[] product = new Smartphone[0];

    public void saveSmartphone (Smartphone growth) {
        Smartphone extra[] = new Smartphone[product.length + 1];
        for (int i = 0; i < product.length; i++) {
            extra[i] = product[i];
        }
        extra[extra.length - 1] = growth;
        product = extra;
    }

    public void removalSmartphone(int id) {
        Smartphone[] extra = new Smartphone[product.length - 1];
        int copyToIndex = 0;
        for (Smartphone growth : product) {
            if (growth.getId() != id) {
                extra[copyToIndex] = growth;
                copyToIndex++;
            }
        }
        product = extra;
    }

    public Smartphone[] getSmartphone() {
        return product;
    }
}
