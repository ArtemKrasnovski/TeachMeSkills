package teachmeskills.lesson7.homework;

public class Main {
    public static void main(String[] args) {

        double summaperimetr = 0;

        Figure[] figure = {new Circle(8),
                new Triangle(5, 5, 5),
                new Rectangle(6, 4),
                new Square(7),
                new Square(12)};

        for (int i = 0; i < figure.length; i++) {
            System.out.println(figure[i].getName() + ": Площадь = " + figure[i].getArea() + " ; Периметр = " + figure[i].getPerimetr());
        }
        for (int i = 0; i < figure.length; i++) {
            summaperimetr += figure[i].getPerimetr();
        }
        System.out.println("-------------------------------------------");
        System.out.println("Сумма периметров всех фигур = " + summaperimetr);
    }
}
