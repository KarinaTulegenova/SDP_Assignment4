public abstract class Device {
    protected Brand brand;
    public Device(Brand brand) {
        this.brand = brand;
    }
    abstract void printType();
    void printInfo() {
        printType();
        brand.printBrand();
    }
}

class Laptop extends Device {
    public Laptop(Brand brand) {
        super(brand);
    }
    @Override
    void printType() {
        System.out.println("Laptop");
    }
}

class Smartphone extends Device {
    public Smartphone(Brand brand) {
        super(brand);
    }
    @Override
    void printType() {
        System.out.println("Smartphone");
    }
}

class Headphones extends Device {
    public Headphones(Brand brand) {
        super(brand);
    }
    @Override
    void printType() {
        System.out.println("Headphones");
    }
}