package oops.basics;


import java.util.*;

class SimpleClassObj {
    public static void main(String args[]) {
        Student s1 = new Student(); // creating new Student object
        s1.name = "Varun";
        s1.rollNo = 12;
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        s1.eat();
        s1.run();

    }
}


class Student { // creating class
    String name;
    int rollNo;
    char gender;
    double percentage;

    void eat() {
        System.out.println("student is eating");
    }

    void run() {
        System.out.println("student is running");
    }
}