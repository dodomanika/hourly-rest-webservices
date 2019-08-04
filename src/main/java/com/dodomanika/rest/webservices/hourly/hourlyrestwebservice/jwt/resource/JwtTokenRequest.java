package com.dodomanika.rest.webservices.hourly.hourlyrestwebservice.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {

  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;

//    {
//        "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTU2NTM3NjI1NSwiaWF0IjoxNTY0NzcxNDU1fQ.KHrWUKnTzjiFl1NgPvwzRmfAehGkLJakt9m1SilLrmjJNmPizYjyaZGkMOqdCl9bgMQjnKqXdgDgENeNpLf4Tw"
//    }

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
