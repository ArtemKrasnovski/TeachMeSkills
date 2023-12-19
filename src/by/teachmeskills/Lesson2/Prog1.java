package by.teachmeskills.Lesson2;

public class Prog1 {

    public static void main(String[] args) {
        int monthnum = 6;
        switch (monthnum) {
            case 1:
                System.out.println("1 месяц - Январь");
                break;
            case 2:
                System.out.println("2 месяц - Февраль");
                break;
            case 3:
                System.out.println("3 месяц - Март");
                break;
            case 4:
                System.out.println("4 месяц - Апрель");
                break;
            case 5:
                System.out.println("5 месяц - Май");
                break;
            case 6:
                System.out.println("6 месяц - Июнь");
                break;
            case 7:
                System.out.println("7 месяц - Июль");
                break;
            case 8:
                System.out.println("8 месяц - Август");
                break;
            case 9:
                System.out.println("9 месяц - Сентябрь");
                break;
            case 10:
                System.out.println("10 месяц - Октябрь");
                break;
            case 11:
                System.out.println("11 месяц - Ноябрь");
                break;
            case 12:
                System.out.println("12 месяц - Декабрь");
                break;

            default:
                System.out.println("Число не от 1 до 12");
        }
    }
}