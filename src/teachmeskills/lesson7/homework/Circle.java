package teachmeskills.lesson7.homework;

public class Circle extends Figure {

    private static final String name = "Круг";

    private double radius;

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
        return name;
    }
}
