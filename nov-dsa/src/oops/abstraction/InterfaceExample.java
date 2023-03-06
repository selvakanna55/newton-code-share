package oops.abstraction;

interface AnimalInterface { //100% abstraction
    public void eat();

    public void sleep();
}

interface C {
}

class Lion implements AnimalInterface, C {

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Lion l = new Lion();
        l.eat();
        l.sleep();
    }
}
