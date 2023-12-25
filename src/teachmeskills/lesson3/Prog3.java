package teachmeskills.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Prog3 {
    public static void main(String[] args) {

        Scanner scrazm = new Scanner(System.in);
        System.out.println("Введи размер массива:");
        int razm = scrazm.nextInt();
        int[] array = new int[razm];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        int min = array[0];
        int max = array[0];
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
            average += (double) array[i] / array.length;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + average);
    }
}
