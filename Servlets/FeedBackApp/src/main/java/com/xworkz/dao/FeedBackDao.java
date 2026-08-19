package com.xworkz.dao;

import com.xworkz.dto.FeedBackDto;
import com.xworkz.dto.UserDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FeedBackDao {
    public void save(FeedBackDto feedBackDto)  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try(Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","sagarhd");
            PreparedStatement ps=con.prepareStatement("insert into feedbacks (user_id,comment,mobile) values(?,?,?)");
        ){
            ps.setInt(1, feedBackDto.getUserId());
            ps.setString(2, feedBackDto.getComment());
            ps.setLong(3,feedBackDto.getMobile());

            int rows=ps.executeUpdate();

        }
        catch (SQLException e){
            e.printStackTrace();
        }


    }
}
