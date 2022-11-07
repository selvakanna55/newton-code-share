package oops.inheritance;

class Vehicle { //parent super base
    static int noWheels;
    final int num = 10; // constant
    private String model;
    protected String brand;

}

class Car extends Vehicle { // child subclass derived
    int noOfSeats;
}

class RaceCar extends Car {
    //
}

class TwoWheeler extends Vehicle {
    int noWheels = 2;

    static class AB {

    }
}


public class SingleInheritance {
    void hi() {
        System.out.println("hi");
    }

    public static void main(String[] args) {
        Car v1 = new Car();
        v1.noWheels = 10;
        Car v2 = new Car();
        v2.noWheels = 20;
//
//        System.out.println(Vehicle.model); // 10
//        System.out.println(Vehicle.noWheels); //20
////        Car v2 = new Car();
////        c1.noOfSeats = 10;
////        c1.brand = "abcd";
    }

}



//
//    Pratibha Rajendrapra...
//        6m ago
//
//        Lec on time complexity
//        Archana Satyanarayan...
//        just now
//
//        hashing
//        Mohd Isham
//        just now
//
//        quick sort && hashing