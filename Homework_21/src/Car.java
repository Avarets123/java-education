import java.util.List;

public class Car {

    private String numbers;

    private String model;

    private String color;

    private int mileage;

    private int price;

    public Car(String numbers, String model, String color, int mileage, int price) {
        this.numbers = numbers;
        this.model = model;
        this.color = color;
        this.mileage = mileage;
        this.price = price;
    }

    public String getNumbers() {
        return numbers;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getMileage() {
        return mileage;
    }

    public int getPrice() {
        return price;
    }
}
