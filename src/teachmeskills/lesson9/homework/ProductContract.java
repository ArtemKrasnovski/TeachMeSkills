package teachmeskills.lesson9.homework;

import java.util.Date;

public class ProductContract extends Document {

    private String typeProduct;
    private int sumProduct;

    protected ProductContract() {
    }

    protected ProductContract(String numDoc, String typeProduct, int sumProduct, Date date) {
        super(date, numDoc);
        this.typeProduct = typeProduct;
        this.sumProduct = sumProduct;
    }

    @Override
    public String toString() {
        return "Контракт на поставку товаров: " +
                "Номер документа - " + numDoc + ";" +
                " Тип товаров - " + typeProduct + ";" +
                " Количество товаров - " + sumProduct + ";" +
                " Дата - " + date;

    }
}
