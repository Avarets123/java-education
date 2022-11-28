package figure;

public class Rectangle extends Figure{

    public Rectangle(int height, int length) {
        super(height, length);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = (getLength() + getHeight()) * 2;
        System.out.println("Периметр прямоугольника равен " + perimeter);
    }


    @Override
    public void calculateArea() {
        double area = getHeight() * getLength();
        System.out.println("Площадь прямоугольника равен " + area);
    }
}
