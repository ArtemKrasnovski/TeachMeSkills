package teachmeskills.lesson2;

import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {

        Scanner scnumber = new Scanner(System.in);
        System.out.println("Введите целое число: ");

        int number = scnumber.nextInt();

        if(number % 2 != 0) {
            System.out.println("Введённое число - Нечётное");
        }
        else System.out.println("Введённое число - Чётное");
        scnumber.close();

    }
}
