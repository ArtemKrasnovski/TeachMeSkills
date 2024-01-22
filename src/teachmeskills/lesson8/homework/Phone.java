package teachmeskills.lesson8.homework;

public class Phone {
    String number;
    String model;
    int weight;

    public Phone() {

    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит: " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит:" + name + " номер:" + number);
    }

    public String getNumber(String number) {
        this.number = number;
        return number;
    }

    public void sendMessage(String... number) {
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
}
