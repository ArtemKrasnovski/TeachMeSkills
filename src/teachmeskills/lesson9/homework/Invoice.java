package teachmeskills.lesson9.homework;

import java.util.Date;

public class Invoice extends Document {
    private int sumMonth;
    private int depCode;

    protected Invoice() {
    }

    protected Invoice(int sumMonth, Date date, String numDoc, int depCode) {
        super(date, numDoc);
        this.sumMonth = sumMonth;
        this.depCode = depCode;
    }

    @Override
    public String toString() {
        return "Финансовая накладная: " +
                "Итоговая сумма за месяц - " + sumMonth + ";" +
                " Дата документа - " + date + ";" +
                " Номер документа - " + numDoc + ";" +
                " Код департамента - " + depCode;

    }

}
