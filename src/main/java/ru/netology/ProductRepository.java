package ru.netology;

public class ProductRepository {
    Product[] products = new Product[0];

    public void save(Product growth) {
        Product extra[] = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            extra[i] = products[i];
        }
        extra[extra.length - 1] = growth;
        products = extra;
    }

    public void removeById(int id) {
        if (findById(id) == null) {
            throw new NotFoundException(id);
        }
        Product[] extra = new Product[products.length - 1];
        int copyToIndex = 0;
        for (Product growth : products) {
            if (growth.getId() != id) {
                extra[copyToIndex] = growth;
                copyToIndex++;
            }
        }
        products = extra;
    }
    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public Product[] getProducts() {
        return products;
    }

}
