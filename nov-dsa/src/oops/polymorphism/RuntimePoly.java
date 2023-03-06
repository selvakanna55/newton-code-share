package oops.polymorphism;

class Animal {
    void eat() {
        System.out.println("animal eats");
    }
}

class Goat extends Animal {
    void eat() {
        System.out.println("goat is eating grass");
    }

    void sleep() {
        System.out.println("goat is sleeping");
    }
}

public class RuntimePoly {
    public static void main(String[] args) {
        Animal g = new Goat(); //upcasting
        // base class = derived
        g.eat();
//        g.sleep();
    }
}
