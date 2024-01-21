package teachmeskills.lesson7.homework;

public class Square extends Rectangle {

    private static final String name = "Квадрат";
    private double length;

    public Square(double length) {
        super(length);
        this.length = length;
    }
    @Override
    public double getArea() {
        double area = length * length;
        return area;
    }
    @Override
    public double getPerimetr() {
        double perimetr = length * 4;
        return perimetr;
    }
    @Override
    public String getName() {
        return name;
    }
}
