package oops.polymorphism;

class ExampleConstructorOverload {
    int rollNo;
    double percentage;

    ExampleConstructorOverload() {
        System.out.println("empty constructor is called");
    }

    ExampleConstructorOverload(int studRollNo) {
        System.out.println("1 args constructor is called");
        rollNo = studRollNo;
    }

    ExampleConstructorOverload(int rollNo, double percentage) {
        System.out.println("2 args constructor is called");
        this.rollNo = rollNo;
        this.percentage = percentage;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        ExampleConstructorOverload ex1 = new ExampleConstructorOverload();
        ExampleConstructorOverload ex2 = new ExampleConstructorOverload(10);
        ExampleConstructorOverload ex3 = new ExampleConstructorOverload(10, 99.1);
    }
}
