package oops.polymorphism;


class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Lion extends Animal {
    void eat() {
        System.out.println("Lion is eating meat");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal l1 = new Lion(); // upcasting -> Runtime polymorphism
        l1.eat();
    }
}