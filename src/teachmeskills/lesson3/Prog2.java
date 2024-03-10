package teachmeskills.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        boolean arrayin = false;
        int[] array = new int[]{0, 1, 1, 2, 3, 4, 4, 5, 1, 4, 10, 6, 7, 8, 9, 10, 10};
        Scanner scannumber = new Scanner(System.in);
        System.out.println("Введи целое число");
        int number = scannumber.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                array[i] = -1;
                arrayin = true;
            }
        }
        if (arrayin == true) {
            System.out.println("Число входит в массив --> замена на -1");
            System.out.println(Arrays.toString(array));
        } else System.out.println("Число не входит в массив");
        scannumber.close();
    }
}





