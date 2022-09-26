package com.project.newton;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
    // TODO: access modifiers for fields

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Id
    int courseId;// course_id
    String name;
    int duration;
    int studentsEnrolled;

    public Course() {
    }

    public Course(int courseId, String name, int duration, int studentsEnrolled) {
        this.courseId = courseId;
        this.name = name;
        this.duration = duration;
        this.studentsEnrolled = studentsEnrolled;
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
