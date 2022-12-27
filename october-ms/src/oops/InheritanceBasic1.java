package oops;

class Parent {
    void printHello() {
        System.out.println("hi...");
    }
}

class Child extends Parent {
    void howAreYou() {
        System.out.println("I'm fine");
    }

}

public class InheritanceBasic1 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.printHello();

        Child c = new Child();
        c.howAreYou();
        c.printHello();
    }
}
