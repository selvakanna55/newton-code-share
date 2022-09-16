package com.learn.newton.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class College {

    public College() {

    }

    public College(Integer id, String name, String city, Integer studentCount) {
        this.clgId = id;
        this.name = name;
        this.city = city;
        this.studentCount = studentCount;
    }
//

    @Id
    Integer clgId;

    String name;

    @Override
    public String toString() {
        return "College{" +
                "clgId=" + clgId +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", studentCount=" + studentCount +
                '}';
    }

    String city;

    public Integer getClgId() {
        return clgId;
    }

    public void setClgId(Integer clgId) {
        this.clgId = clgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(Integer studentCount) {
        this.studentCount = studentCount;
    }

    Integer studentCount;



}
