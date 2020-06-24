/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class ExistingUser<T,K>{
    
   private T email, username, password, id, location;
   private K latitude,longitude;
   private String usertag = "";
   private T gender;
    
    public ExistingUser(T email, T password, T username,T gender,T id,T location,K latitude,K longitude){
        this.username=username;
        this.email=email;
        this.password=password;
        this.id=id;
        this.gender=gender;
        this.location=location;
        this.latitude=latitude;
        this.longitude=longitude;
    }

   public void storeDatabase() {
        try{
            String url = "jdbc:mysql://34.87.155.63:3306/friendzone?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection con = DriverManager.getConnection(url, "root", "password");
            Statement query = con.createStatement();
            usertag += userTag();
            query.executeUpdate("INSERT INTO signup (email,password,username,gender,usertag,specialid,location,latitude,longitude) VALUES('"+email.toString()+"', '"+password.toString()+"', '"+username.toString()+"', '"+gender.toString()+"', '"+usertag+"', '"+id.toString()+"', '"+location.toString()+"','"+latitude+"','"+longitude+"');");

            con.close();
        }catch(Exception e){
            System.out.println("Error!!!");
        }
    }
   
   public char userTag(){
       String newtag = "A";
        try{
            String url = "jdbc:mysql://34.87.155.63:3306/friendzone?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection conn = DriverManager.getConnection(url, "root", "password");
            Statement query = conn.createStatement();
            ResultSet rs = query.executeQuery("SELECT usertag FROM signup WHERE email = '"+email.toString()+"';");
            while(rs.next()){
                String temp = rs.getString("usertag");
                if(temp.charAt(0)>newtag.charAt(0))
                    newtag = temp;
            }
            conn.close();
        }catch(Exception e){
            System.out.println("Error!");
        }
        char sqltag = (char)(newtag.charAt(0)+1);
        return sqltag;
   }

    
}
