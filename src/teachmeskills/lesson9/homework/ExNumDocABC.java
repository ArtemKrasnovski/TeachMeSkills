package teachmeskills.lesson9.homework;

public class ExNumDocABC extends RuntimeException{
    public ExNumDocABC(String value) {
        super("Номер документа не содержит последовательности " + value);
    }
}
