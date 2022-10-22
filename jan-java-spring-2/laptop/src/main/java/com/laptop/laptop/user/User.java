package com.laptop.laptop.user;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    public User() {
    }

    public User(int id, String userName, String phoneNo) {
        this.id = id;
        this.userName = userName;
        this.phoneNo = phoneNo;
    }

    @Id
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    String userName;
    String phoneNo;
}
