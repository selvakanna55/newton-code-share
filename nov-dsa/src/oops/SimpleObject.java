package oops;

import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double percentage;

    Student(String studName, int studRollNo, double studPercentage) {
        name = studName;
        rollNo = studRollNo;
        percentage = studPercentage;
    }


    void eat() {
        System.out.println(name + " is eating");
    }
}

public class SimpleObject {
    public static void main(String[] args) {
        Student s1 = new Student("Varun", 10, 99.8);
        Student s2 = new Student("Tarun", 20, 55);
        System.out.println(s1.name);
        s1.eat();
    }
}
