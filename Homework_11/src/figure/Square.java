package figure;

public class Square extends Figure {

    public Square(int sides) {
        super(sides);
    }

    @Override
    public void calculatePerimeter() {
        int a = getLength();
        double perimeter = a + a + a + a;
        System.out.println("Периметр квадрата равен " + perimeter);
    }


    @Override
    public void calculateArea() {
        double area = Math.pow(getLength(), 2);
        System.out.println("Площадь квадрата равен " + area);
    }
}
