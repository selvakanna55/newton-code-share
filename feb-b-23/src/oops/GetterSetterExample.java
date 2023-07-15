package oops;


public class GetterSetterExample {
    public static void main(String args[]) {
        Car22 c1 = new Car22(4);
        c1.applyDrive();
    }
}


class Car22 {
    int wheels;

    Car22(int wheels) {
        this.wheels = wheels;
    }

    void applyDrive() {
        System.out.println("driving");
        System.out.println(wheels);
        System.out.println(this.wheels);
    }
}

// static -> can be called without creating object