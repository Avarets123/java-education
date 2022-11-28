import java.util.List;

public interface CarFeatures<T> {
    List<String> findCarsWithColorBlackOrMileageZero();
    int findUniqueCarsWithPrice(int to, int from);
    T getCarColorWhichMinPrice();
    double averageSumCars();
}
