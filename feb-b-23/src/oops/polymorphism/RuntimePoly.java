package oops.polymorphism;

// https://my.newtonschool.co/playground/code/neok3y0f8zzb
// https://my.newtonschool.co/playground/code/sh3034s6h78z

public class RuntimePoly {

    public static void main(String[] args) {
        Lion l1 = new Lion();  // upcasting
        // object of lion class is converted into animal class
        Cat c1 = new Cat();
//        int num = 10;
//        int num1 = (int) 10.75;
//        l1.run(); -> no as it not a part of animal
        // 10.75 -> 10
        // (int)10.75 -> 10
//        Lion l1 = new Lion();
//        l1.eat();
//        l1.run();
    }

    public static void callAnimalEat(Lion l1) {
        l1.eat();
    }

}

class Animal {
    void eat() {
        System.out.println("animal is eating");
    }
}

class Lion extends Animal {
    void eat() {
        System.out.println("Lion is eating");
    }
//    void run() {
//        System.out.println("Lion is running");
//    }
}

class Cat extends Animal {

}

