package oops;

public class RuntimePoly {

    // Newton School Online Java compiler to run Java online.
    // Write Java code in this online editor and run it.
    public static void main(String[] args) {
        // Parent obj = new Child(); // upcasting
        Lion1 l = new Lion1(); // late binding
        l.printImKing();

        // entryFee(l);

        // Cat1 c = new Cat1();
        // entryFee(c);
    }

    static void entryFee(Animal1 a) {
        a.sound();
        a.eat();
    }
}

class Animal1 {
    void sound() {
        System.out.println("no common sound for animals");
    }

    void eat() {
        System.out.println("All animals can eat");
    }
}

class Lion1 extends Animal1 {
    void sound() {
        System.out.println("lion roars");
    }

    void printImKing() {
        System.out.println("My name is lion, and im the king of this forest");
    }
}

class Cat1 extends Animal1 {
    void sound() {
        System.out.println("cat - meww");
    }
}