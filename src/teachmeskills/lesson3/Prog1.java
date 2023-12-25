package teachmeskills.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        Scanner scnumber = new Scanner(System.in);
        System.out.println("Введи целое число");
        int number = scnumber.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("Число входит в массив");
                break;
            } else if (i == array.length - 1) {
                System.out.println("Число не входит в массив");
            }
        }
        scnumber.close();
    }
}

