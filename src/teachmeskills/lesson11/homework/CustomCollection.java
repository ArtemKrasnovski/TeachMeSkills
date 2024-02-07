package teachmeskills.lesson11.homework;

//Представим, что в Java нет коллекции типа ArrayList.
//        Создать свой класс, симулирующий работу класса динамической коллекции - т.е. создать свою кастомную
//        коллекцию.
//        В основе коллекции будет массив.
//        Кастомная коллекция должна хранить элементы разных классов(т.е. это geпeric).
//        Предусмотреть операции добавления элемента, удаления элемента, получение элемента по индексу,
//        проверка есть ли элемент в коллекции, метод очистки все коллекции.
//        Предусмотреть конструктор без параметров - создает массив размером по умолчанию.
//        Предусмотреть конструктор с задаваемым размером внутреннего массива.
//        Предусмотреть возможность автоматического расширения коллекции при добавлении элемента в том
//        случае, когда коллекция уже заполнена.

public class CustomCollection<T> {


    public static void main(String[] args) {

        CustomCollection<Integer> list = new CustomCollection<>();
        list.add(123);
        list.add(456);
        list.add(789);
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        list.add(555);
        list.add(666);
        list.add(777);
        list.add(888);

        System.out.println("Созданная коллекция:" + list);
        System.out.println("Количество элементов коллекции: " + list.size); // вывод для проверки добавления
        System.out.println();

        list.del(1);
        System.out.println("Удалён элемент с индексом '1' : " + list);
        System.out.println("Количество элементов коллекции: " + list.size);
        System.out.println("Элемент коллекции с индексом '6' : " + list.get(6));
        System.out.println();
        System.out.println("Есть ли элемент в коллекции '0' ? - " + list.contains(0));
        System.out.println("Есть ли элемент в коллекции '555' ? - " + list.contains(555));
        System.out.println();

        list.clear();

        System.out.println("Коллекция очищена:" + list);
        System.out.println("Количество элементов коллекции: " + list.size);
    }

    private Object[] array;
    private static final int defSize = 10;
    private int size = 0;


    private CustomCollection(int startSize) {
        this.array = new Object[startSize];
        this.size = size();
    }

    private CustomCollection() {
        this(defSize);
    }

    private void increaseArray() {
        double newSize = array.length * 1.5;
        Object[] newArray = new Object[(int) newSize];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    private void changeSize(int newSize) {
        size = newSize;
    }

    private int size() {
        return size;
    }

    private void add(T element) {
        if (size == array.length) {
            increaseArray();
        }
        array[size] = element;
        changeSize(size + 1);
    }

    private T del(int index) {
        if (index >= 0 && index < size) {
            T delElement = (T) array[index];
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            changeSize(size - 1);
            array[size] = null;
            return delElement;
        }
        throw new IndexOutOfBoundsException("Ошибка удаления, проверить инидекс!");
    }

    private T get(int index) {
        if (index >= 0 && index < size) {
            return (T) array[index];
        }
        throw new IndexOutOfBoundsException("Ошибка, проверить инидекс!");
    }

    private boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(array[i])) {
                return true;
            }
        }
        return false;
    }

    private void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        changeSize(0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" [ ");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(" ; ");
            }
        }
        sb.append(" ] ");
        return sb.toString();
    }

}

