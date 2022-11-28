import java.util.List;
import product.Product;
import product.ProductRepository;
import product.Tests;


public class Main {
  public static void main(String[] args) {

    ProductRepository productRepository = new ProductRepository("products.txt");

    Product bread = productRepository.findById(3);
    Tests.assertEquals("Хлеб", bread.getName());
    Tests.assertEquals(25.0, bread.getPrice());


    bread.setPrice(30);
    bread.setCount(57);
    productRepository.update(bread);

    Product updatedBread = productRepository.findById(3);
    Tests.assertEquals(30.0, updatedBread.getPrice());
    Tests.assertEquals(57, updatedBread.getCount());

    testByTitle(productRepository, "М");


  }



  public static void testByTitle(ProductRepository productRepository, String title) {
    List<Product> products = productRepository.findByTitleLike(title);
    for (Product prod : products) {
      Tests.assertEquals(prod.getName(), title);
    }

  }
}