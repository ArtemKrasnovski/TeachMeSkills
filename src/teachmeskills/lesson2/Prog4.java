package teachmeskills.lesson2;

import java.util.Scanner;

public class Prog4 {

    public static void main(String[] args) {

        Scanner sctemp = new Scanner(System.in);
        System.out.println("Введи значение температуры: ");

        float temp = sctemp.nextFloat();

        if (temp > -5) {
            System.out.println("Тепло");
        } else if (temp <= -20) {
            System.out.println("Холодно");
        } else System.out.println("Нормально");
        sctemp.close();
    }
}
