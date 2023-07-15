package oops.abstraction;


public class CarExample {
    public static void main(String args[]) {
//        Car c1 = new Car();
        Maruti m1 = new Maruti();
        new Maruti();
        m1.engine();
    }
}

abstract class Car { // Object creation for Car class is disabled
    abstract void engine(); //ensure it is implemented in all children
}

class Maruti extends Car {
    void engine() {
        System.out.println("indian made engine");
    }
}

