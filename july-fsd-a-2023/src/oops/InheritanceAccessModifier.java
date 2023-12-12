package oops;

public class InheritanceAccessModifier {
    public static void main(String[] args) {
            
    }
}

class Vehicle1 {
    public int model;
    private int year;
    protected int engineNo;
    int chaseNo;
}

class Car1 extends Vehicle1 {
    void print() {
        System.out.println(model + " " + engineNo + " " + chaseNo);
        // year not allowed
    }
}