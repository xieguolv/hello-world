package com.example.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class User {
    @Id
    private String id;

    private String username;

    private String password;

    private String countnumber;

    public String getCountnumber() {
        return countnumber;
    }

    public void setCountnumber(String countnumber) {
        this.countnumber = countnumber;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [id = " + id + ", username = " + username + ", password = " + password + ", counynumber = " + countnumber + "]";
    }
}

