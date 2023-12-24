package teachmeskills.lesson2;

import java.util.Scanner;

public class Prog8 {

    public static void main(String[] args) {
        int sum = 0;
        Scanner scnumber = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        int number = scnumber.nextInt();

        for (int a = 1; a <= number; a++) {
            sum = a + sum;
        }
        System.out.println("Сумма чисел от 1 до " + number + " = " + sum);
        scnumber.close();
    }
}
