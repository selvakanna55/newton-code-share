package com.example.demo.course;


public class Course {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int id;
    String name;

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
