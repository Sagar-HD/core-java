package com.xworkz.dto;


public class UserLoginDto {
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserLoginDto(String password, String username) {
        this.password = password;
        this.username = username;
    }
}
