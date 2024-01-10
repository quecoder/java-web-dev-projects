package technology;

public class Computer extends AbstractEntity {
    private String brand;
    private String model;
    private double price;

    public Computer(String brand, String model, double price) {
        super();
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}
