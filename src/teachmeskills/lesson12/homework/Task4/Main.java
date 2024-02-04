//Создать класс для описания клиента.
//        Поместить в класс поля для описания клиента (дата регистрации(LocalDate), имя, возраст и другие поля по усмотрению).
//        Класс клиента должен содержеть поле-коллекцию с заказами этого клиента - это, своего рода, корзина заказов клиента.
//        Класс заказа должен создежать поля для описания заказ (цена, описание и возможны другие поля).
//        Создать нескольких клиентов.
//        Для каждого клиента создать несколько заказов и поместить их в поле-коллекцию для заказов.
//        Создать коллекцию типа Мар и заполнить ее парами "номер паспорта клиента" -> "объект класса клиент".
//        Номера паспортов можно хранить как константы в созданном для этого интерфейсе.
//        Пройти циклом по коллекции и вывести на экран:
//        - все пары ключ-значение, использую Map.Entry<K, V> entry : map.entrySet()
//        - все пары ключ-значение, использую итератор
//        - все ключи, используя map.keySet()
//        - все значения, используя map.values()

package teachmeskills.lesson12.homework.Task4;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client(LocalDate.of(2024, Month.JANUARY, 1), "client1", 35, "1111111111");

        Client client2 = new Client(LocalDate.of(2024, Month.JANUARY, 2), "client2", 25, "2222222222");

        Client client3 = new Client(LocalDate.of(2024, Month.JANUARY, 3), "client3", 30, "3333333333");


        client1.addOrder(
                List.of(new Order(50000, "Ноутбуки"),
                        new Order(12000, "ПК")));

        client1.addOrder(
                List.of(new Order(25000, "Видеокарты"),
                        new Order(5000, "Жесткие диски")));

        client2.addOrder(
                List.of(new Order(1000, "Напитки"),
                        new Order(2000, "Продукты")));

        client3.addOrder(
                List.of(new Order(10000, "Строительные материалы"),
                        new Order(20000, "Строительный инструмент")));

        client3.addOrder(
                List.of(new Order(11111, "Строительные материалы_2"),
                        new Order(22222, "Строительный инструмент_2")));


        HashMap<String, Client> map = new HashMap<>();
        map.put(client1.getPassportNum(), client1);
        map.put(client2.getPassportNum(), client2);
        map.put(client3.getPassportNum(), client3);

        for (Map.Entry<String, Client> pary : map.entrySet()) {
            System.out.println(pary);
        }

        System.out.println();


        Iterator<Map.Entry<String, Client>> mapIterator = map.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry<String, Client> data = mapIterator.next();
            System.out.println(data);
        }

        System.out.println();

        System.out.println("Все ключи: " + map.keySet());

        System.out.println();

        System.out.println("Все значения: " + map.values());

    }
}
