package com.example.demo.course;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
    Course() {
    }

    @Id
    int id;
    String name;

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


    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
