public interface Brand {
    void printBrand();
}

class Samsung implements Brand {
    @Override
    public void printBrand() {
        System.out.println("Samsung"); }
}

class Apple implements Brand {
    @Override
    public void printBrand() {
        System.out.println("Apple"); }
}

class Huawei implements Brand {
    @Override
    public void printBrand() {
        System.out.println("Huawei"); }
}