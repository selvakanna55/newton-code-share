package com.example.demo.student;

public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public Student(String name, int rollNo, double percentage) {
        this.name = name;
        this.rollNo = rollNo;
        this.percentage = percentage;
    }

    String name;


    int rollNo;
    double percentage;
}
