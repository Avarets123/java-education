package figure;

public class Ellipse extends Circle {

    private double radiusB;


    public Ellipse(double radiusA, double radiusB) {
        super(radiusA);
        this.radiusB = radiusB;

    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Для вычисления периметра эллипса не нашел простой формулы ");
    }


    @Override
    public void calculateArea() {
        double area = 3.14 * getRadius() * this.radiusB;
        System.out.println("Площадь эллипса равен " + area);
    }


}
