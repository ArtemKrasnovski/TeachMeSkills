//Создать свой класс для описания заказа.
//        Класс должен содержать поля id заказа и стоимость заказа - обязательные поля.
//        Создать несколько заказов и поместить их в коллекцию.
//        Вывести коллекцию на экран.
//        Отсортировать заказы и вывести отсортированную коллекцию на экран.
//        Заказы сортируются по цене по возрастанию.
//        Для сортировки заказов следует создать свой компаратор (смотрите пример с занятия).

package teachmeskills.lesson12.homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>(List.of(

                new Order(2, 3000),
                new Order(98, 6545689),
                new Order(4, 144)
        ));
        System.out.println(orders);
        System.out.println();
        System.out.println("Сортируем коллекцию по стоимости заказа");
        orders.sort(Comparator.comparing(Order::sum));
        System.out.println(orders);
    }

    public record Order(Integer id, Integer sum) {
    }

}
