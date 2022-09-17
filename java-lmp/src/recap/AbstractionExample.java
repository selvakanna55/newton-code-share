package recap;

// dont allow to create an object for animal
abstract class Animal1 {
    void eat() {
        System.out.println("Animal is eating");
    }

    // want to force all my children to override the sound
    abstract void sound();
}

class Lion1 extends Animal1 {
    void sound() {
        System.out.println("roars");
    }
}

class Dog1 extends Animal1 {
    void sound() {
        System.out.println("barks");
    }
}

class Cow1 extends Animal1 {
    @Override
    void sound() {
        System.out.println("maa");
    }
    //maa
}

public class AbstractionExample {
    public static void main(String[] args) {
        Lion1 l = new Lion1();
        l.eat();
        Dog1 d = new Dog1();
        d.eat();
        Cow1 c = new Cow1();
        c.eat();
//        Animal1 a = new Animal1();
//        a.eat();
    }
}
