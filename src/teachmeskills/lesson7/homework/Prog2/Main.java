// Создать классы "Директор", "Рабочий", "Бухгалтер".
// Реализовать интерфейс с методом, который печатает название должности
// и имплементировать этот метод в созданные классы.

package teachmeskills.lesson7.homework.Prog2;

import teachmeskills.lesson7.homework.*;

public class Main {
    public static void main(String[] args) {

        PrintJobTitle[] list = {new Director("Александр", "Директор"),
                new Buhgalter("Анна", "Бухгалтер"),
                new Worker("Михаил", "Рабочий")};

        for (int i = 0; i < list.length; i++) {
            list[i].print();
        }
    }
}
