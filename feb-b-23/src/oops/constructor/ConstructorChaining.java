package oops.constructor;


public class ConstructorChaining {
    public static void main(String args[]) {
        Car66 c1 = new Car66("hundai");
        System.out.println(c1.name + " " + c1.year);

    }
}


class Car66 {
    String name;
    String year;

    Car66() {
        System.out.println("new car is created");
    }

    Car66(String name, String year) {
        this();
        this.name = name;
        this.year = year;
    }

    Car66(String name) {
        this(name, "2023");
    }
}