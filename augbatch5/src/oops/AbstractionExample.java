package oops;

import java.util.Scanner;

// abstract = > not 100%
// interface => 100 %

import java.util.Scanner;

abstract class Animal2 { //
    int age;

    Animal2() {
        this.age = 0;
    }

    Animal2(int age) {
        this.age = age;
    }

    abstract void sound(); // function signature
    // all child should implement

    // common other
    void walk() {
        System.out.println("animal is walking");
    }
}

class Cat2 extends Animal2 {
    Cat2() {
        super(2);
    }

    void sound() {
        System.out.println("mewww");
    }
}

class Lion2 extends Animal2 {

    void sound() {
        System.out.println("roars");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Animal2 a2 = new Animal2();
        Cat2 c2 = new Cat2();
        Lion2 l2 = new Lion2();
        l2.sound();
        l2.walk();
    }
}
