package com.college.college.departments;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
    @Id
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getStaffCount() {
        return staffCount;
    }

    public void setStaffCount(int staffCount) {
        this.staffCount = staffCount;
    }

    public Department() {
    }

    public Department(int id, String name, int staffCount) {
        this.id = id;
        Name = name;
        this.staffCount = staffCount;
    }

    String Name;
    int staffCount;
}
