package teachmeskills.lesson9.homework;

public class ExNumDoc555 extends RuntimeException{
    public ExNumDoc555(String value) {
        super("Номер документа не начинается с последовательности " + value);
    }
}
