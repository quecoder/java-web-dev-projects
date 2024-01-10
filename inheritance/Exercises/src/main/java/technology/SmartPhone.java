package technology;

public class SmartPhone extends Computer {
    private double size;

    public SmartPhone(String brand, String model, double price, double size) {
        super(brand, model, price);
        this.size = size;
    }

    public double getSize() {
        return size;
    }
}
