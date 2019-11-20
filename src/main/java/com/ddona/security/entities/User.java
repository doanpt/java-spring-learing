package com.ddona.security.entities;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int user_id;
    @Column(name = "username")
    public String username;
    @Column(name = "password")
    public String password;
    @Column(name = "role")
    public String role;
    @Column(name = "enabled")
    public boolean enabled;

    public User() {
    }

    public User(int id, String username, String password, String role, boolean enabled) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.user_id = id;
        this.enabled = enabled;
    }


    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
