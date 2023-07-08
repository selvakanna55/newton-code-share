package oops.basics;


class ConstructorBasic {
    public static void main(String args[]) {
        // className varibaleName = new className();
        Car c2 = new Car();
    }
}


class Car {
    Car() {
        System.out.println("new car is created");
    }
}