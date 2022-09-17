package recap;

class Vehicle {
    int gears;
    int wheels;

    void drive() {
        System.out.println("driving vehicle");
    }

    void applyBreak() {
        System.out.println("applying break. stopped");
    }
}

class Car extends Vehicle {
    boolean hasPowerWindow;
    int seats;
    int noOfAirBags;

    void turnOnAc() {
        System.out.println("turningOnAC");
    }
}

class Truck extends Vehicle {
    private String carry;

    public String getCarry() {
        return carry;
    }

    public void setCarry(String carry) {
        this.carry = carry;
    }


}

public class SimpleInheritance {
    public static void main(String[] args) {
        System.out.println("Sdf");
        Car ab = new Car();
        ab.seats = 4;
        ab.gears = 4;
        ab.drive();
        ab.turnOnAc();
    }
}
