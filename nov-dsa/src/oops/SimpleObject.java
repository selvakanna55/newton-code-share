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

        Student arr[] = new Student[2];
        arr[0] = s1;
        arr[1] = s2;

        for (int i = 0; i < 2; i++) {
            System.out.println(arr[i].percentage);
        }
    }
}
