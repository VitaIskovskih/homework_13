package ru.netology;

public class ProductManager {
    private ProductRepository productRepo;

    ProductManager(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    public void add(Product product) {
        productRepo.save(product);
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        for (Product product : productRepo.getProducts()) {
            if (matches(product, text)) {
                Product extra[] = new Product[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    extra[i] = result[i];
                }
                extra[extra.length - 1] = product;
                result = extra;
            }
        }
        return result;
    }

    public boolean matches(Product product, String search) {
        return product.getName().contains(search);
    }
}
