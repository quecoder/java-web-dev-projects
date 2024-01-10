package technology;

public class Program {
    public static void main(String[] args) {
        // Test Computer class
        Computer computer = new Computer("Dell", "Inspiron", 999.99);
        System.out.println(computer.getBrand());
        System.out.println(computer.getPrice());
        System.out.println(computer.getModel());

        // Test Laptop class
        Laptop laptop = new Laptop("Apple", "MacBook Pro", 1499.99, 8);
        System.out.println(laptop.getMemoryStored());
        System.out.println(laptop.getBrand());
        System.out.println(laptop.getModel());
        System.out.println(laptop.getPrice());

        // Test SmartPhone class
        SmartPhone phone = new SmartPhone("Samsung", "Galaxy S20", 799.99, 14.8);
        System.out.println(phone.getSize());
        System.out.println(phone.getBrand());
        System.out.println(phone.getModel());
        System.out.println(phone.getPrice());
    }
}
