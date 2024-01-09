// Создать трехмерный массив из целых чисел.
//С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число. Пусть
//число, на которое будет увеличиваться каждый элемент, задается из КОНСОЛИ.

package teachmeskills.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        int[][][] array = new int[][][]{{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}, {{13, 14, 15}, {16, 17, 18}}};

        Scanner scnumber = new Scanner(System.in);
        System.out.println("Введи число для увеличения: ");
        int number = scnumber.nextInt();

        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.println();
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += number;
                    System.out.print(array[i][j][k] + "  ");
                }
            }
        }
    }
}
