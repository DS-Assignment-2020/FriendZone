/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import Login.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class UserInfo<T,K> implements Info{
    private T email, username, password, gender, location;
    private String id;
    
    public UserInfo(T email, T password, T username,T gender,String id, T location){
        this.username=username;
        this.email=email;
        this.password=password;
        this.gender=gender;
        this.id=id;
        this.location=location;
    }

    @Override
    public void storeDatabase() {
        try{
            String url = "jdbc:mysql://34.87.155.63:3306/friendzone?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection connection = DriverManager.getConnection(url, "root", "password");
            Statement query = connection.createStatement();
            query.executeUpdate("INSERT INTO signup (email,password,username,gender,usertag,specialid,location) VALUES('"+email.toString()+"', '"+password.toString()+"', '"+username.toString()+"', '"+gender.toString()+"','A' ,'"+id+"', '"+location.toString()+"');");
            
            connection.close();
        }catch(Exception e){
            System.out.println("Error!");
        }
    }

//    public String getID() {
//        try{
//            String url = "jdbc:mysql://34.87.155.63:3306/friendzone?zeroDateTimeBehavior=CONVERT_TO_NULL";
//            Connection conn = DriverManager.getConnection(url, "root", "password");
//            Statement query = conn.createStatement();
//            ResultSet rs = query.executeQuery("SELECT userid FROM signup WHERE email = '"+email.toString()+"';");
//            while ( rs.next() ) {
//                id = rs.getString("userid");
//            }
//            conn.close();
//        }catch(Exception e){
//            System.out.println("Error!");
//        }
//        return id;
//    }
    
}
