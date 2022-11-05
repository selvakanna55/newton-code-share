package oops.inheritance;

class Vehicle { //parent super
    int noWheels;
    private String model;
    protected String brand;
}

class Car extends Vehicle { // child subclass
    int noOfSeats;
}


public class SingleInheritance {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.noOfSeats = 10;
        c1.brand = "abcd";

    }

}
