public class Main {
    public static void main(String[] args) {
        UseCarFeatures carFeatures = new UseCarFeatures("input.txt");

        System.out.println(carFeatures.averageSumCars());
        System.out.println(carFeatures.findCarsWithColorBlackOrMileageZero());
        System.out.println(carFeatures.findUniqueCarsWithPrice(10000, 10000000));
        System.out.println(carFeatures.getCarColorWhichMinPrice());
    }
}