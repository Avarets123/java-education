import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UseCarFeatures implements CarFeatures<Car> {

    private List<Car> cars = new ArrayList<>();

    private  final String filename;


    public UseCarFeatures(String filename) {
        this.filename = filename;
    }


    @Override
    public List<String> findCarsWithColorBlackOrMileageZero() {
        try {
            return new BufferedReader(new FileReader(filename))
                    .lines()
                    .map(mapStringToCar)
                    .filter(car -> car.getColor().equals("Black") || car.getMileage() == 0)
                    .map(Car::getNumbers)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public int findUniqueCarsWithPrice(int to, int from) {
        try {
            return new BufferedReader(new FileReader(filename))
                    .lines()
                    .map(mapStringToCar)
                    .filter(car -> car.getPrice() > to && car.getPrice() < from)
                    .distinct()
                    .toList()
                    .size();
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public Car getCarColorWhichMinPrice() {
        try {
            return new BufferedReader(new FileReader(filename))
                    .lines()
                    .map(mapStringToCar)
                    .min(Comparator.comparingInt(Car::getPrice))
                    .get();
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public double averageSumCars() {
        try {
            return new BufferedReader(new FileReader(filename))
                    .lines()
                    .map(mapStringToCar)
                    .mapToInt(Car::getPrice)
                    .average()
                    .getAsDouble();
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    private final Function<String, Car> mapStringToCar = str -> {
        String[] values = str.split("\\|");
        return new Car(values[0], values[1], values[2], Integer.parseInt(values[3]), Integer.parseInt(values[4]));
    };
}
