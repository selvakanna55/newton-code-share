package oops;


class Animal {
    void eat() {
        System.out.println("animal is eating");
    }
}

class Cat extends Animal {
    void eat() {
        System.out.println("cat is eating");
    }
}

class Rabbit extends Animal {
    void eat() {
        System.out.println("rabbit is eating");
    }

    void jump() {
        System.out.println("jumping");
    }
}

// javc Main.java
// java Main

public class RuntimePolymorphism {
    static void printAnimalEat(Animal animal) {
        animal.eat();
    }


    public static void main(String[] args) {
        int a = 10;
        Animal animal = new Cat(); // runtime polymorphism, late binding
        animal.eat();
    }
}
