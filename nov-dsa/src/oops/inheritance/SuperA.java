package oops.inheritance;

class A {
    int a;

    A() {
    }

    void hello() {
        System.out.println("hello from parent class");
    }

    A(int x) {
        a = x;
    }
}

class B extends A {
    int b;

    B(int x) {
        super(99);
        b = x;
    }

    void hello() {
        super.hello();
        System.out.println("hello from child class");
    }
}


public class SuperA {
    public static void main(String[] args) {
        B objec1 = new B(10);
        objec1.hello();
    }
}
