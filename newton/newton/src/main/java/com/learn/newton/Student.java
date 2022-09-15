package com.learn.newton;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    Integer rollNo;
    String degree;
    String dept;
    String name;

    Student(){

    }
    public Student(String name, int rollNo, String degree, String dept) {
        this.name = name;
        this.rollNo = rollNo;
        this.degree = degree;
        this.dept = dept;
    }


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

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

}
