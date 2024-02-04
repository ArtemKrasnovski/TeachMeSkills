package teachmeskills.lesson12.homework.Task4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Client {
    private final LocalDate dateReg;
    private final String name;
    private final int age;
    private final String passportNum;
    List<Order> orderList;

    protected Client(LocalDate dateReg, String name, int age, String passportNum) {
        this.dateReg = dateReg;
        this.name = name;
        this.age = age;
        this.passportNum = passportNum;
        this.orderList = new ArrayList<Order>(0);
    }

    protected void addOrder(List<Order> newList) {
        orderList.addAll(newList);
    }

    protected List<Order> getOrders() {
        return orderList;
    }

    protected String getPassportNum() {
        return passportNum;
    }

    public String toString() {
        return name + " ЗАКАЗ " + getOrders();
    }
}

