import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import ru.netology.NotFoundException;
import ru.netology.Product;
import ru.netology.ProductRepository;

public class ProductRepositoryTest {
Product index1 = new Product(10, "Книга", 800);
Product index2 = new Product(11, "Телефон", 2000);
Product index3 = new Product(12, "Книга", 1500);

  @Test
    public void testAddProducts() {
      ProductRepository repo = new ProductRepository();
      repo.save(index1);
      repo.save(index2);
      repo.save(index3);

      Product[] expected = {index1, index2, index3};
      Product[] actual = repo.getProducts();

      Assertions.assertArrayEquals(expected, actual);
    }

  @Test
  public void testDeleteProducts() {
    ProductRepository repo = new ProductRepository();
    repo.save(index1);
    repo.save(index2);
    repo.save(index3);
    repo.removeById(index3.getId());

    Product[] expected = {index1, index2};
    Product[] actual = repo.getProducts();

    Assertions.assertArrayEquals(expected, actual);
  }

  @Test
  public void testNotFoundException() {
    ProductRepository repo = new ProductRepository();
    repo.save(index1);
    repo.save(index2);
    repo.save(index3);


    Assertions.assertThrows(NotFoundException.class,
            () -> {
      repo.removeById(4);
            });
  }
}
