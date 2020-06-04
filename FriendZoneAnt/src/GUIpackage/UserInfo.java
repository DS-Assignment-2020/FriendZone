/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIpackage;

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
    private T email, username, password, gender;
    private int number;
    private String id;
    
    public UserInfo(T email, T password, T username,T gender){
        this.username=username;
        this.email=email;
        this.password=password;
        this.gender=gender;
    }

    @Override
    public void storeDatabase() {
        try{
            String url = "jdbc:mysql://localhost:3306/friendzonetest?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC#";
            Connection con = DriverManager.getConnection(url, "root", "password");
            Statement query = con.createStatement();
            id = "0004";
//            PreparedStatement stmt = con.prepareStatement("INSERT INTO logintest (email,password,username,gender,userid) VALUES(?, ?, ?, ?, ?);");
//            stmt.setString (1, (String) email);
//            stmt.setString (2, (String) password);
//            stmt.setString   (3, (String) username);
//            stmt.setString(4,(String) gender);
//            stmt.setString    (5, (String) id);
//            stmt.execute();
              query.executeUpdate("INSERT INTO signup (email,password,username,gender,userid) VALUES('"+email.toString()+"', '"+password.toString()+"', '"+username.toString()+"', '"+gender.toString()+"', '"+id.toString()+"');");
//            while(get.next()){
//                String email = get.getString("email");
//                System.out.println(email);
//            }
            con.close();
        }catch(Exception e){
            System.out.println("Error!");
        }
    }

    @Override
    public String getID() {
        try{
            String url = "jdbc:mysql://localhost:3306/friendzonetest?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC#";
            Connection conn = DriverManager.getConnection(url, "root", "password");
            Statement query = conn.createStatement();
            ResultSet rs;
            rs = query.executeQuery("SELECT userid FROM signup WHERE email = '"+email.toString()+"';");
            while ( rs.next() ) {
                id = rs.getString("userid");
                System.out.println(id);
            }
            conn.close();
        }catch(Exception e){
            System.out.println("Error!");
        }
        return id;
    }
    
}
