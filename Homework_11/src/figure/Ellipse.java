package figure;

public class Ellipse extends Figure {

    public Ellipse(int sideA, int sideB) {
        super(sideA, sideB);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Для вычисления периметра эллипса не нашел простой формулы ");
    }


    @Override
    public void calculateArea() {
        double area = 3.14 * getHeight() * getLength();
        System.out.println("Площадь эллипса равен " + area);
    }
}
