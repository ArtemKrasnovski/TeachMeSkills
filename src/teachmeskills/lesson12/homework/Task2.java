//Создать коллекцию целых чисел.
//        Заполните коллекцию рандомными числами.
//        Пусть размер коллекции задается с консоли.
//        Предусмотреть возможно ошибок при получении размера коллекции с консоли.
//        Предусмотреть проверку введенного размера коллекции на валидность.
//        Посчитайте и выведите на экран среднее арифметическое все элементов коллекции.

package teachmeskills.lesson12.homework;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Task2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList();

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        double average = 0;

        while (true) {
            try {
                System.out.println("Введите длину коллекции: ");
                int listLength = scanner.nextInt();
                if (listLength < 1) {
                    System.out.println("Длина не может быть меньше 1 !!!");
                    continue;
                }
                for (int i = 0; i < listLength; i++) {
                    list.add(random.nextInt(100) - 20);
                }
                break;
            } catch (InputMismatchException exception) {
                System.out.println("Неверный формат ввода для длины коллекции!");
                return;    // не получилось с этого момента вернуться к возврату ввода длины коллекции
            }
        }

        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));         // вывод коллекции для проверки
        }

        for (int i = 0; i < list.size(); i++) {
            average += (double) list.get(i) / list.size();
        }
        System.out.println("Среднее арифметическое всех элементов = " + average);

        scanner.close();

    }
}



