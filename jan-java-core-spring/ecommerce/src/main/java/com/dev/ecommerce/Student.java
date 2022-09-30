package com.dev.ecommerce;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    int rollNo;
    String name;
    double mark;

    public Student(int rollNo, String name, double mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    public Student() {
    }


    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

}
