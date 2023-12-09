package oops;


public class InheritanceExample {
    // Newton School Online Java compiler to run Java online.
    // Write Java code in this online editor and run it.
    public static void main(String[] args) {
        Car maruti = new Car();
        System.out.println(maruti.wheels);
        maruti.printMaxCapacity();
        maruti.drive();
        maruti.playTv();
    }
}


class Vehicle {
    void drive() {
        System.out.println("driving.....");
    }
}

class FourWheeler extends Vehicle { // fourwheeler is a vehicle
    int wheels = 4;

    void printMaxCapacity() {
        System.out.println("1000  KGS");
    }
}

class Car extends FourWheeler {
    void playTv() {
        System.out.println("playing tv");
    }
}



