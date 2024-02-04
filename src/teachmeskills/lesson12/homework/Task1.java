//Создать коллекцию целых чисел и заполнить ее значениями, введенными с консоли.
//        При заполнении коллекции числами с консоли следует делать приведения типа.
//        Код для привдения строки к числу можно использовать следующий:
//        int i = Integer.parseInt(str);
//        или
//        int val = Integer.valueOf(str);
//        Для окончания ввода введите слово "exit".
//        При приведении строки к числу, следует учитывать возможность исключений.
//        Некоторые полезные примеры кода для приведения строки к числу можно найти по ссылке
//        https://www.geeksforgeeks.org/how-to-convert-a-string-to-an-int-in-java/
//        На экран вывести четные числа из коллекции.

package teachmeskills.lesson12.homework;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите целое число (для завершения введите 'exit'): ");
            try {
                String input = scanner.nextLine();
                if ("exit".equals(input)) {
                    System.out.println("Добавление чисел в коллекцию завершено!");
                    break;
                } else {
                    list.add(Integer.parseInt(input));
                }
            } catch (NumberFormatException exception) {
                System.err.println("Неверный формат для ввода!");
                System.out.println();
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                System.out.println("Четное число коллекции - " + list.get(i));
            }
        }

        scanner.close();
    }
}