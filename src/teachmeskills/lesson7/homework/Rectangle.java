package teachmeskills.lesson7.homework;

public class Rectangle extends Figure {
    private static final String name = "Прямоугольник";

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        double area = length * width;
        return area;
    }

    @Override
    public double getPerimetr() {
        double perimetr = 2 * (length + width);
        return perimetr;
    }

    @Override
    public String getName() {
        return name;
    }
}
