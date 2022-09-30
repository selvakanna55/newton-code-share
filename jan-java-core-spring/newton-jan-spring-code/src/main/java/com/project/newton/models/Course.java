package com.project.newton.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {
    // TODO: access modifiers for fields


    @Id
    int courseId;// course_id
    String name;
    int duration;
    int studentsEnrolled;

    @ManyToOne
    public Department department; // const, getter, setter


    public Course(int courseId, String name, int duration, int studentsEnrolled, Department department) {
        this.courseId = courseId;
        this.name = name;
        this.duration = duration;
        this.studentsEnrolled = studentsEnrolled;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    public Course() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(int studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }
}
