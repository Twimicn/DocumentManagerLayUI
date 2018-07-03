package com.twimi.documentmanager.Model;

import lombok.Data;

@Data
public class User {
    private int id;
    private String username;
    private String password;
    private String email;

    public User() {

    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
