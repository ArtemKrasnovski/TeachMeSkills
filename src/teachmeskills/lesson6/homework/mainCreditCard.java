//        Напишите программу, которая создает три объекта класса CreditCard
//        у которых заданы номер счета и начальная сумма.
//        Тестовый сценарий для проверки:
//        Положите деньги на первые две карточки и снимите с третьей. Выведите на экран текущее состояние
//        всех трех карточек.

package teachmeskills.lesson6.homework;

public class mainCreditCard {
    public static void main(String[] args) {

        CreditCard card1 = new CreditCard("1234 5445 6852 0000", 200);
        CreditCard card2 = new CreditCard("4853 8965 0065 4856", 100);
        CreditCard card3 = new CreditCard("5741 9672 0329 1111", 50);

        card1.plusMoney(55);
        card2.plusMoney(9);
        card3.minusMoney(10);

        card1.info();
        card2.info();
        card3.info();
    }
}
