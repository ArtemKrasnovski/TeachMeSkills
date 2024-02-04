package teachmeskills.lesson12.homework.Task4;

public class Order {
    private final double price;
    private final String description;

    protected Order(double price, String description) {
        this.price = price;
        this.description = description;
    }

    protected String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return getDescription() + " цена " + price;
    }
}
