package oops;

class Animal2 {
    void sound() {
        System.out.println("animal sound....");
    }
}

class Lion2 extends Animal2 {
    void sound() {
        System.out.println("roars....");
        super.sound();
    }
}


public class OverridingExample {
    public static void main(String[] args) {
        Lion2 lion = new Lion2();
        lion.sound(); //roars
    }
}
