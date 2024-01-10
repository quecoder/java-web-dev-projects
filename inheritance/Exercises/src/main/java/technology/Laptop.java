package technology;

public class Laptop extends Computer {
    private int memoryStored;

    public Laptop(String brand, String model, double price, int memoryStored) {
        super(brand, model, price);
        this.memoryStored = memoryStored;
    }

    public int getMemoryStored() {
        return memoryStored;
    }
}
