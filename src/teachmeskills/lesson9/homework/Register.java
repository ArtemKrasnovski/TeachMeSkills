package teachmeskills.lesson9.homework;

public class Register implements RegDoc {

    private final Document[] docs = new Document[10];
    private int numberOfDocuments = 0;

    public void saveDoc(Document document) {
        if (numberOfDocuments < 10) {
            docs[numberOfDocuments] = document;
            numberOfDocuments++;
            System.out.println("Документ добавлен");

        } else {
            System.out.println("Добавление не возможно. Регистр Заполнен!");
        }

    }

    public void infoDoc(Document document) {
        System.out.println(document);
    }

}

