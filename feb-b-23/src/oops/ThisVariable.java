package oops;

public class ThisVariable {

    public static void main(String args[]) {
        Car c1 = new Car(4);
        c1.applyDrive();
    }
}


class Car {
    int wheels;

    Car(int wheels1) {
        this.wheels = wheels1;
    }

    void applyDrive() {
        System.out.println("driving");
        System.out.println(wheels);
        System.out.println(this.wheels);
    }
}

// static -> can be called without creating object