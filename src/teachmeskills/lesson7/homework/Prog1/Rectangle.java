package teachmeskills.lesson7.homework.Prog1;

public class Rectangle extends Figure {
    private static final String NAME_RECTANGLE = "Прямоугольник";

    protected final double length;
    protected final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
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
        return NAME_RECTANGLE;
    }
}
