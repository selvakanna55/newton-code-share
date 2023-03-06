package oops.abstraction;

abstract class Animal { //partial abstraction
    // for any animal, eat and sleep should be enforced - need to create blueprint
    int age = 0;

    void location() {
        System.out.println("lives on earth");
    }

    abstract void eat();

    abstract void sleep();

}


class Goat extends Animal {

    void eat() {
        System.out.println("Goat is eating");
    }

    void sleep() {
        System.out.println("Goat is sleeping");
    }

}


public class SimpleAbstractClass {
    public static void main(String[] args) {
//        Animal a = new Animal();
        Goat g = new Goat();
        g.eat();
        g.sleep();
    }
}
