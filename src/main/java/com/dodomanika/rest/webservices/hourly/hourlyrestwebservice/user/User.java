package com.dodomanika.rest.webservices.hourly.hourlyrestwebservice.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank(message = "Name is mandatory")
    private String username;
    private String password;
    private String role;

    protected User() {
    }

    public User(@NotBlank(message = "Name is mandatory") String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
