package teachmeskills.lesson7.homework.Prog1;

public class Circle extends Figure {

    private static final String NAME_CIRCLE = "Круг";

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public double getPerimetr() {
        double perimetr = 2 * Math.PI * radius;
        return perimetr;
    }

    @Override
    public String getName() {
        return NAME_CIRCLE;
    }
}
