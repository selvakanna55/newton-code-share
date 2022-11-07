package oops;
// package, default

class Animal1 {
    void sound() {
        System.out.println("animal sound");
    }
}

class Cat1 extends Animal1 {

    void sound() {
        System.out.println("mewww");
    }

    void eat() {
        System.out.println("cat is eating ");
    }

}

class Rat extends Animal1 {
}

public class RuntimePoly {
    public static void main(String[] args) {
        //late binding
        // base = derived
        Animal1 c2;
        Animal1 c3;

        Animal1 c1 = new Cat1();//upcasting
        c1.sound();
//        c1.eat();

        Student s1 = new Student(1, "Newton");
        System.out.println(s1);
        System.out.println(s1.toString());
        int num = 10;
        System.out.println(s1 instanceof Student);
        System.out.println(c1 instanceof Animal1);
        System.out.println(c1 instanceof Rat);
//        System.out.println(s1 instanceof Calculator);

    }
}


// this -> current obj
// super -> immediate parent