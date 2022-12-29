package oops.access_modifiers;

import today_tests.Hello;

import java.util.Scanner;

class Student {
    private String name;
    private double percentage;

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public int getRollNo() {
        return rollNo;
    }

    private int rollNo;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}

public class GetterSetter {
    public static void main(String[] args) {
        Hello h = new Hello();
        h.printHello();
//        Student s1 = new Student();
//        s1.setName("abcd");
//        System.out.println(s1.getName());
//        System.out.println(s1.getRollNo());
    }
}
