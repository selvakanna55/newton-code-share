package oops.encapsulation.accessmodifer;


public class WithInheritance {
    public static void main(String args[]) {
        RaceCar r = new RaceCar();
        r.racerCarPrint();
    }
}

class Car {
    int num = 1; //deault
    private int wheels = 2;
    public int seats = 3;
    protected int mirror = 4;

    int getWheels() {
        return wheels;
    }

}

class RaceCar extends Car {
    void racerCarPrint() {
        System.out.println(num + " " + getWheels() + " " + seats + " " + mirror);
        // wheels -> private is not accessible
    }
}
// static -> can be called without creating object