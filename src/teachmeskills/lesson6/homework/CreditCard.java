//        Создать класс CreditCard с полями номер счета, текущая сумма на счету.
//        Добавьте метод, который позволяет начислять сумму на кредитную карточку.
//        Добавьте метод, который позволяет снимать с карточки некоторую сумму.
//        Добавьте метод, который выводит текущую информацию о карточке.
//        Напишите программу, которая создает три объекта класса CreditCard
//        у которых заданы номер счета и начальная сумма
//        Тестовый сценарий для проверки:
//        Положите деньги на первые две карточки и снимите с третьей. Выведите на экран текущее состояние
//        всех трех карточек.

package teachmeskills.lesson6.homework;

public class CreditCard {
    String accountNumber;
    int accountBalance;

    CreditCard(String accountNumber, int accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    int plusMoney(int plusMoney) {
        accountBalance += plusMoney;
        return accountBalance;
    }

    int minusMoney(int minusMoney) {
        accountBalance -= minusMoney;
        return accountBalance;
    }

    int info() {
        System.out.println("Номер карты: " + accountNumber + ", " + "Текущий остаток: " + accountBalance);
        return accountBalance;
    }
}
