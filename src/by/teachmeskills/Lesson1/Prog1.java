package by.teachmeskills.Lesson1;

import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {

        Scanner scname = new Scanner(System.in);
        System.out.println("Введите своё имя: ");

        String name = scname.nextLine();

        System.out.println("Привет " + name + " !!!");

        scname.close();

    }
}