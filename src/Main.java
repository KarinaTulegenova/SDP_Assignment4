public class Main {
    public static void main(String[] args) {
        Device device1 = new Laptop(new Samsung());
        Device device2 = new Smartphone(new Apple());
        Device device3 = new Headphones(new Huawei());
        device1.printInfo();
        device2.printInfo();
        device3.printInfo();
    }
}