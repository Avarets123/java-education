package product;

import java.util.Objects;

public class Product {

  private final Integer id;
  private String name;
  private double price;
  private int count;

  public Product(Integer id, String name, double price, int count) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.count = count;
  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getCount() {
    return count;
  }

  @Override
  public String toString() {
    return "" + id + "|" + name + "|" + price + "|" + count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Double.compare(product.price, price) == 0 && count == product.count &&
        Objects.equals(id, product.id) && Objects.equals(name, product.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, price, count);
  }
}
