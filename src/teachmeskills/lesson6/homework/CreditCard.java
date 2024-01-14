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
    int currentBalance;
    int plusMoney;
    int minusMoney;

    CreditCard(String accountNumber, int accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    int plusMoney(int plusMoney) {
        accountBalance += plusMoney;
        return currentBalance;
    }

    int minusMoney(int minusMoney) {
        accountBalance -= minusMoney;
        return currentBalance;
    }

    int info() {
        System.out.print("Номер карты: " + accountNumber + ", " + "Текущий остаток: ");
        return accountBalance;
    }
}
