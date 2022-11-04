import product.Product;
import product.ProductRepository;

public class Main {
    public static void main(String[] args) {

        ProductRepository productRepository = new ProductRepository("products.txt");

        Product product = new Product(5, "Сгущенка", 24.8, 7);
        productRepository.update(product);

        System.out.println(productRepository.findById(3));
        System.out.println(productRepository.findByTitleLike("К"));




    }
}