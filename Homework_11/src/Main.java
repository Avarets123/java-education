import figure.Circle;
import figure.Ellipse;
import figure.Rectangle;
import figure.Square;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        circle.calculateArea();
        circle.calculatePerimeter();
        circle.moveTo(12, -10);


        Rectangle rectangle = new Rectangle(5, 7);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        rectangle.moveTo(32, 3);


        Square square = new Square(9);
        square.calculateArea();
        square.calculatePerimeter();
        square.moveTo(-12, -5);

        Ellipse ellipse = new Ellipse(6, 2);
        ellipse.calculateArea();
        ellipse.calculatePerimeter();
        ellipse.moveTo(-12, 33);
    }
}
