/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author Owner
 */
public class DatabaseTest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        getConnection();
    }
    
    public static Connection getConnection(){
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/friendzonetest?useTimezone=true&serverTimezone=UTC#";
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, "root", "password");
            System.out.println("dj");
        }catch(Exception e){
            System.out.println("Error!");
        }
        
        return null;
    }
}
