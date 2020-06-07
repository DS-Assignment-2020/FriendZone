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
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class ExistingUser<T,K>{
    
   private T email, username, password, id;
   private K gender;
    
    public ExistingUser(T email, T password, T username,K gender,T id){
        this.username=username;
        this.email=email;
        this.password=password;
        this.id=id;
        this.gender=gender;
    }

   public void storeDatabase() {
        try{
            String url = "jdbc:mysql://34.87.155.63:3306/friendzone?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection con = DriverManager.getConnection(url, "root", "password");
            Statement query = con.createStatement();
            query.executeUpdate("INSERT INTO signup (email,password,username,gender,userid) VALUES('"+email.toString()+"', '"+password.toString()+"', '"+username.toString()+"', '"+gender.toString()+"', '"+id.toString()+"');");

            con.close();
        }catch(Exception e){
            System.out.println("Error!");
        }
    }

    
}
