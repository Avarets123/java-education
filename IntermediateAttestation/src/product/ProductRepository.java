package product;

import java.io.*;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductRepository implements CustomRepository<Product> {

    private final String filename;

    public ProductRepository(String filename) {
        this.filename = filename;
    }

    @Override
    public Product findById(int id) {

        try {
            return productStream()
                    .filter(prod -> prod.getId() == id)
                    .findFirst()
                    .get();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }

    }

    @Override
    public List<Product> findByTitleLike(String title) {
        try {
            return productStream()
                    .filter(product -> product.getName().contains(title))
                    .toList();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }

    }

    @Override
    public void update(Product item) {
        BufferedWriter writer = null;
        try {

            List<String> products = productStream()
                    .map((Product product) -> {
                        if (product.getId() == item.getId()) {
                            return item;
                        }
                        return product;
                    })
                    .map(mapToString)
                    .toList();


            writer = new BufferedWriter(new FileWriter(filename));
            for (String prod : products) {
                writer.write(prod + "\n");
            }

        } catch (IOException e) {
            throw new IllegalStateException(e);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    public Stream<Product> productStream() throws IOException {
        return
            new BufferedReader(new FileReader(filename))
                .lines()
                .map(mapToProduct);
    }


    private final Function<String, Product> mapToProduct = s -> {
        String[] parts = s.split("\\|");
        return new Product(
                Integer.parseInt(parts[0]),
                parts[1],
                Double.parseDouble(parts[2]),
                Integer.parseInt(parts[3]));
    };


    private final Function<Product, String> mapToString = Product::toString;



}
