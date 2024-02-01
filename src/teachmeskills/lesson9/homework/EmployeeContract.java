package teachmeskills.lesson9.homework;

import java.util.Date;

public class EmployeeContract extends Document {

    private String nameEmployee;
    private Date dateEndContract;

    protected EmployeeContract() {
    }

    protected EmployeeContract(String numDoc, Date date, Date dateEndContractint, String nameEmployee) {
        super(date, numDoc);
        this.dateEndContract = dateEndContractint;
        this.nameEmployee = nameEmployee;
    }

    @Override
    public String toString() {
        return "Контракт с сотрудником: " +
                " Дата документа - " + date + ";" +
                " Номер документа - " + numDoc + ";" +
                " Дата окончания контракта - " + dateEndContract + ";" +
                " Имя сотрудника - " + nameEmployee;

    }
}
