package oops;

import java.util.Scanner;

class Student {
    // member variables, attributes
    int rollNo;
    String name;
    double percentage;

    // member functions
    void printHello() {
        System.out.println("hello");
    }
}
// static methods -
// instance method


class Employee {
    String name;
    int salary;

    void printCompany() {
        System.out.println("ABCD");
    }
}

public class ClassObjects {
    public static void main(String[] args) {
        Student st1 = new Student(); // object
        st1.name = "Varun";
        st1.rollNo = 70;
        st1.percentage = 98.74;

        Student st2 = new Student(); // object
        st2.name = "john";
        st2.rollNo = 11;
        st2.percentage = 88.97;

        System.out.println(st1.name);
        System.out.println(st1.rollNo);
        System.out.println(st1.percentage);

        System.out.println(st2.name);
        System.out.println(st2.rollNo);
        System.out.println(st2.percentage);
    }
}
