package revision_dsa1.oopsrecap;

class Animal {
    void eat() {
        System.out.println("animal is eating");
    }
}

class Lion extends Animal {
    void eat() {
        System.out.println("lion is eating");
    }

    void drink() {
        System.out.println("lion is drinking");
    }
}

public class RunTimePoly {
    public static void main(String[] args) {
        Lion l1 = new Lion(); // upcasing
        l1.eat();
        l1.drink();
    }
}
