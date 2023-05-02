package oops.polymorphism;


class Animal4 {
    int age;

    void eat() {
        System.out.println("Animal4 is eating");
    }
}

class Lion4 extends Animal4 {
    void eat() {
        System.out.println("Lion4 is eating meat");
    }
}

class Cat extends Animal4 {
    void eat() {
        System.out.println("Cat is eating fish");
    }
}

class Donkey extends Animal4 {
    void eat() {
        System.out.println("Donkey is eating grass");
    }
}


public class RuntimePolyExampleDeep {

    // assume this funciton is big -> 100 lines
    public static void printAgeAnimal4(Animal4 obj) {
        System.out.println(obj.age);
    }

    public static void main(String[] args) {
        Animal4 raj = new Lion4(); //upcasing
        raj.age = 101;

        Cat orio = new Cat();
        orio.age = 1;

        Donkey d1 = new Donkey();
        d1.age = 3;

        printAgeAnimal4(raj);
        printAgeAnimal4(orio);
        printAgeAnimal4(d1);
    }

}