package revision_dsa1.oopsrecap;

class Vehicle {

    int noOfWheels;
    String made;

    Vehicle(String made) {
        System.out.println("called ");
        this.made = made;
    }

    Vehicle() {
        System.out.println("dummy vehicle is created");
    }

    void drive() {
        System.out.println("driving vehicle");
    }

    void stop() {
        System.out.println("stopping vehicle");
    }
}

public class SimpleClass {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle("japan");
        v1.noOfWheels = 10;
        v1.drive();
    }
}
