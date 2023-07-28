package app.data;


public class Product {

    private final String name;
    private final price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
