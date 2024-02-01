package teachmeskills.lesson9.homework;

public class ExNumDoc1a2b extends RuntimeException{
    public ExNumDoc1a2b(String value) {
        super("Номер документа не заканчивается на последовательность " + value);
    }
}
