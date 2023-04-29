package oops.inheritance;

class Animal {
    int age; // 4 6
    int legs;
    String name; // Lion, Monkey

    void eat() {
        System.out.println("animal is eating");
    }
}


class Lion extends Animal {
    void sound() {
        System.out.println("roars");
    }

}

class Cat extends Animal {
    void sound() {
        System.out.println("meow");
    }
}


public class SingleInheritance {
    public static void main(String[] args) {
//        Animal lion = new Animal();
//        lion.age = 4;
//        lion.name = "Lion";
//        lion.eat();
        Lion l1 = new Lion();
        l1.age = 4;
        l1.legs = 4;
        l1.name = "Lion";
        l1.eat();
        l1.sound();

        Cat c1 = new Cat();
        c1.age = 4;
        c1.name = "robin";
        c1.legs = 4;
        c1.eat();
        c1.sound();

    }
}
