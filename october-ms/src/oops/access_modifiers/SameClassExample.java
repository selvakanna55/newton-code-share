package oops.access_modifiers;

class Laptop {
    public int ram; // anyone
    private int harddisk; // only to myself
    protected String processor; // myself, my children

    public Laptop(int ram, int rom, String processor) {
        this.ram = ram;
        this.harddisk = rom;
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }
}

public class SameClassExample {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(10, 200, "Intel");
        System.out.println(laptop.ram);
//        System.out.println(laptop.harddisk);
        System.out.println(laptop.processor);
        System.out.println(laptop.getRam());
    }
}
