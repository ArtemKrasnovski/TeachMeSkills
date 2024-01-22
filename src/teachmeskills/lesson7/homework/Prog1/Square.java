package teachmeskills.lesson7.homework.Prog1;

public class Square extends Rectangle {

    private static final String NAME_SQUARE = "Квадрат";

    public Square(double length) {
        super(length, length);
    }

    @Override
    public String getName() {
        return NAME_SQUARE;
    }
}
