package recap;


class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Lion extends Animal {

    int lionAge;

    void sound() {
        System.out.println("roars");
    }

    @Override
    void eat() {
//        super.eat(); //super will point to immediate parent
        System.out.println("Lion is eating: raw meat");
    }
}

public class Overriding {
    public static void main(String[] args) {
//        Lion l = new Lion();
        Animal l = new Lion(); // upcasting
        l.eat();
//        l.lionAge = 10;
//        l.sound();
//
//        l.eat();

    }
}
