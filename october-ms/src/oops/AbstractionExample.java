package oops;

//abstract class Animal1 {
//    abstract void sound();
//
//    void print() {
//        System.out.println("this is animal");
//    }
//}
//
//class Lion1 extends Animal1 {
//    void sound() {
//        System.out.println("roar");
//    }
//}
//
//class Cat1 extends Animal1 {
//    void sound() {
//        System.out.println("mewww");
//    }
//}

abstract class Vehicle {
    abstract void start();
}

class Cycle extends Vehicle {
    void start() {
        System.out.println("peddle");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("kick");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Cycle v1 = new Cycle();
        v1.start();

    }
}
