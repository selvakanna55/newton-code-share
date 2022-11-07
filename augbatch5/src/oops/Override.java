package oops;

class Animal {
    int age;


    Animal(int age) {
        super();
    }

    void sound() {
        System.out.println("animal sound");
    }

    static void eat() {
        System.out.println("animal is eating");
    }

    final void getLocation() {
        System.out.println("forest");
    }

    final void getLocation(int a) {
        System.out.println("location is " + a);
    }
}

class Cat extends Animal {
    Cat(int age) {
        super(age);
    }

     void sound() {
        System.out.println("mewww");
        eat();
//        super.sound();
    }

}

//public => public
// protected => protected, public

public class Override {
    public static void main(String[] args) {
        //late binding

        Cat c1 = new Cat(10);
        c1.sound();
        System.out.println(c1.toString());
    }
}


// this -> current obj
// super -> immediate parent