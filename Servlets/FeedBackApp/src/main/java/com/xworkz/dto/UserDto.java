package com.xworkz.dto;

public class UserDto {
    private int id;
    private String name;
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserDto(String email, int id, String name, String password) {
        this.email = email;
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDto{"+this.getName()+","+this.getEmail()+"}";
    }
}
