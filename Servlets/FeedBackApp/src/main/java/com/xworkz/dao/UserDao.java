package com.xworkz.dao;

import com.xworkz.dto.UserDto;
import com.xworkz.dto.UserLoginDto;

import java.sql.*;

public class UserDao {
    public void save(UserDto user) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "sagarhd");
             PreparedStatement ps = con.prepareStatement("insert into users (name,email,password,id) values(?,?,?,?)");
        ) {
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.setInt(4, user.getId());

            int rows = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public boolean validateLogin(UserLoginDto userLoginDto) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "sagarhd");
             PreparedStatement ps = con.prepareStatement("select * from users where name = ? ");
        ) {
            ps.setString(1, userLoginDto.getUsername());

            try (
                    ResultSet rs = ps.executeQuery();

            ) {
                if (rs.next()) {
                    String password = rs.getString("password");
                    return userLoginDto.getPassword().equals(password);

                } else {
                    return false;
                }

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

    return false;
    }

    public UserDto userByName(String username){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "sagarhd");
             PreparedStatement ps = con.prepareStatement("select * from users where name = ? ");
        ) {
            ps.setString(1,username);

            try (
                    ResultSet rs = ps.executeQuery();

            ) {
                if (rs.next()) {
                    UserDto userDto=new UserDto(rs.getString("email"),rs.getInt("id"),rs.getString("email"),rs.getString("password"));
                    return userDto;

                } else {
                    return null;
                }

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
