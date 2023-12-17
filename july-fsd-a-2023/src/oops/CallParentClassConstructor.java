package oops;


public class CallParentClassConstructor {
    // Newton School Online Java compiler to run Java online.
    // Write Java code in this online editor and run it.
    public static void main(String[] args) {
        Car19 c1 = new Car19("abcd", 2001);

    }
}

class Vehicle19 {
    String name;

    Vehicle19(String name) {
        this.name = name;
        System.out.println("Vehicle19 created");
    }
}

class Car19 extends Vehicle19 {
    int year;

    Car19(String name, int year) {
        super(name);// call parent class constructor?
        this.year = year;
        System.out.println("Car19 created");
    }
}