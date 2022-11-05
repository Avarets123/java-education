import product.Product;
import product.ProductRepository;

public class Main {
  public static void main(String[] args) {

    ProductRepository productRepository = new ProductRepository("products.txt");

    Product bread = productRepository.findById(3);
    bread.setCount(100);
    bread.setPrice(25);

    productRepository.update(bread);

  }
}