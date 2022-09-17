package recap;


interface AnimalInterface {
    // inside an interface is static final
    int age = 10;

    default void printAge() { // java 8
        System.out.println("age of animal is 10");
    }

    void eat();

    void sound();
}

// class A inherit class B,          class A extends B
// Class A implements an interface B, class A implements B
class Lion2 implements AnimalInterface {

    public void eat() {
        System.out.println("Lion eats");
    }

    public void sound() {
        System.out.println("roar");
    }
}

class Cow2 implements AnimalInterface {
    public void eat() {
        System.out.println("Cow2 eats");
    }

    public void sound() {
        System.out.println("maa");
    }
}

public class InterfaceExample {
}
