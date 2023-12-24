package teachmeskills.lesson2;

public class Prog2 {

    public static void main(String[] args) {
        int month = 3;
        String season;

        if (month == 1 || month == 2 || month == 12)
            season = "Зима";
        else if (month == 3 || month == 4 || month == 5)
            season = "Весна";
        else if (month == 6 || month == 7 || month == 8)
            season = "Лето";
        else if (month == 9 || month == 10 || month == 11)
            season = "Осень";
        else
            season = "Неверный номер месяца !!!";
        System.out.println("Пора года - " + season);
    }

}
