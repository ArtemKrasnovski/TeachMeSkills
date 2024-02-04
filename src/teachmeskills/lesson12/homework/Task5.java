//Создать коллекцию уникальных имен всех студентов нашей группы + преподаватель.
//        Вывести коллекцию на экран.

package teachmeskills.lesson12.homework;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {

        ArrayList<String> integerArrayList = new ArrayList<>();

        integerArrayList.add("Ирина");
        integerArrayList.add("Артем");
        integerArrayList.add("Ольга");
        integerArrayList.add("Артем");
        integerArrayList.add("Алеся");
        integerArrayList.add("Евгений");
        integerArrayList.add("Илья");
        integerArrayList.add("Святослав");
        integerArrayList.add("Павел");
        integerArrayList.add("Роланд");
        integerArrayList.add("Ольга");
        integerArrayList.add("Станислав");

        System.out.println("Наша группа:");
        System.out.println(integerArrayList);

        TreeSet<String> integerHashSet = new TreeSet<>(integerArrayList);

        System.out.println();

        System.out.println("Уникальная коллекция:");
        System.out.println(integerHashSet);

    }
}
