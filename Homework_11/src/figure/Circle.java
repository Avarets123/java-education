package figure;

public class Circle extends Figure {


    public Circle(double radius) {
        super(radius);
    }


    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * 3.14 * getRadius();
        System.out.println("Периметр круга равен " + perimeter);
    }


    @Override
    public void calculateArea() {
        double area = 3.14 * (getRadius() * getRadius());
        System.out.println("Площадь данного круга равен " + area);
    }

}
