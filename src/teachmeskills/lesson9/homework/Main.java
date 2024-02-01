//Доработать нулевое домашнее задание предыдущего урока.
//        Теперь надо создать свои классы исключений на каждую ситуацию:
//        - Проверить содержит ли номер документа последовательность аЬс.
//        - Проверить начинается ли номер документа с последовательности 555.
//        - Проверить заканчивается ли номер документа на последовательность 1а2Ь.
//        Если  номер  документа   не  удовлетворяет  условию   -  то   "бросить" исключение.
//        В методе класса, в котором будут вызываться эти методы для демонстрации работы, перехватить
//        исключение конструкцией try-catch и в блоке catch вывести сообщение для пользователя (сообщение  на
//        консоль).

        package teachmeskills.lesson9.homework;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Document document1 = null;
        Document document2 = null;
        Document document3 = null;
        Document document4 = null;
        Document document5 = null;
        Document document6 = null;
        Document document7 = null;
        Document document8 = null;
        Document document9 = null;
        Document document10 = null;
        Document document11 = null; // для проверки переполнения регистра


        try {
            document1 = new ProductContract("555rgvgabc11a2b", "Laptops", 02, new Date());
        } catch (ExNumDoc555 | ExNumDocABC | ExNumDoc1a2b exception) {
            System.err.println(exception.getMessage());
        }
        try {
            document2 = new EmployeeContract("555abc01451a2b", new Date(), new Date(125, 12, 30), "Андрей");
        } catch (ExNumDoc555 | ExNumDocABC | ExNumDoc1a2b exception) {
            System.err.println(exception.getMessage());
        }
        try {
            document3 = new Invoice(1000000, new Date(), "555abcc1a2b", 555666);
        } catch (ExNumDoc555 | ExNumDocABC | ExNumDoc1a2b exception) {
            System.err.println(exception.getMessage());
        }
        try {
            document4 = new Invoice(1000000, new Date(), "55abcc1a2b", 555666);
        } catch (ExNumDoc555 | ExNumDocABC | ExNumDoc1a2b exception) {
            System.err.println(exception.getMessage());
        }
        try {
            document5 = new Invoice(1000000, new Date(), "555abcc12b", 555666);
        } catch (ExNumDoc555 | ExNumDocABC | ExNumDoc1a2b exception) {
            System.err.println(exception.getMessage());
        }
        try {
            document6 = new Invoice(1000000, new Date(), "555bcc1a2b", 555666);
        } catch (ExNumDoc555 | ExNumDocABC | ExNumDoc1a2b exception) {
            System.err.println(exception.getMessage());
        }
        try {
            document7 = new Invoice(1000000, new Date(), "555abcc1a2b", 555666);
        } catch (ExNumDoc555 | ExNumDocABC | ExNumDoc1a2b exception) {
            System.err.println(exception.getMessage());
        }
        try {
            document8 = new Invoice(1000000, new Date(), "555abcc1a2b", 555666);
        } catch (ExNumDoc555 | ExNumDocABC | ExNumDoc1a2b exception) {
            System.err.println(exception.getMessage());
        }
        try {
            document9 = new Invoice(1000000, new Date(), "555abcc1a2b", 555666);
        } catch (ExNumDoc555 | ExNumDocABC | ExNumDoc1a2b exception) {
            System.err.println(exception.getMessage());
        }
        try {
            document10 = new Invoice(1000000, new Date(), "555abcc1a2b", 555666);
        } catch (ExNumDoc555 | ExNumDocABC | ExNumDoc1a2b exception) {
            System.err.println(exception.getMessage());
        }


        Register register = new Register();
        register.saveDoc(document1);
        register.saveDoc(document2);
        register.saveDoc(document3);
        register.saveDoc(document4);
        register.saveDoc(document5);
        register.saveDoc(document6);
        register.saveDoc(document7);
        register.saveDoc(document8);
        register.saveDoc(document9);
        register.saveDoc(document10);
        register.saveDoc(document11); // для проверки переполнения регистра

        System.out.println();

        register.infoDoc(document1);
        register.infoDoc(document2);
        register.infoDoc(document3);
        register.infoDoc(document4);
        register.infoDoc(document5);
        register.infoDoc(document6);
        register.infoDoc(document7);
        register.infoDoc(document8);
        register.infoDoc(document9);
        register.infoDoc(document10);

    }
}

