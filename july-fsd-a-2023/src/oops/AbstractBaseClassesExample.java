package oops;


public class AbstractBaseClassesExample {
    public static void main(String[] args) {
        Lion c1 = new Lion();
        c1.sound();
        c1.eat();
    }
}

abstract class Animal { // no object creation is allowed
    abstract void sound(); // all children must have sound function

    void eat() {
        System.out.println("animal is eating");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("mew");
    }
}

class Lion extends Animal {
    void sound() {
        System.out.println("roars");
    }
}

// dont allow object creation for Animal class -> solved
// ensure all children of animal class has sound function