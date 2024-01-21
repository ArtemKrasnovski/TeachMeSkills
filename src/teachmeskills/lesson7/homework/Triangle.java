package teachmeskills.lesson7.homework;

public class Triangle extends Figure {
    private static final String name = "Треугольник";

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {  //площать треугольника через формулу Герона
        double pp = (side1 + side2 + side2) / 2;
        double area = Math.sqrt(pp * (pp - side1) * (pp - side2) * (pp - side3));
        return area;
    }

    @Override
    public double getPerimetr() {
        double perimetr = side1 + side2 + side2;
        return perimetr;
    }

    @Override
    public String getName() {
        return name;
    }
}
