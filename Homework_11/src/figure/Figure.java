package figure;

public class Figure {
    private int height;
    private int length;
    private double radius;

    public Figure(int height, int length) {
        this.height = height;
        this.length = length;
    }

    public Figure(int sides) {
        this.height = sides;
        this.length = sides;
    }

    public Figure(double radius) {
        this.radius = radius;
    }

    public void moveTo(int x, int y) {
        System.out.println("Фигура была перемещена по оси X и Y" + "\n По x: " + x + ", по у: " + y);
    }


    public void calculatePerimeter() {
    }

    public void calculateArea() {
    }

    public double getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }
}
