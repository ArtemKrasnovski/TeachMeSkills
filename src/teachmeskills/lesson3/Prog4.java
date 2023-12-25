package teachmeskills.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args) {

        int[] array1 = new int[5];
        int[] array2 = new int[5];
        double average1 = 0;
        double average2 = 0;

        Random random = new Random();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(100) -20 ; // диапазон от -20 до 100
            average1 += (double) array1[i] / array1.length;
        }
        System.out.println("Массив 1 ");
        System.out.println(Arrays.toString(array1));

        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(100) -20 ; // диапазон от -20 до 100
            average2 += (double) array2[i] / array2.length;
        }
        System.out.println("Массив 2 ");
        System.out.println(Arrays.toString(array2));

        if (average1 > average2) {
            System.out.println("Среднее арифметическое 1 массива больше");
        } else if (average1 < average2) {
            System.out.println("Среднее арифметическое 2 массива больше");
        } else System.out.println("Среднее арифметическое 1 и 2 массива равны");
    }
}




