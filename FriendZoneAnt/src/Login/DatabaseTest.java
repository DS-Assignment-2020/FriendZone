/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
/**
 *
 * @author Owner
 */
public class DatabaseTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try{
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            String url = "jdbc:mysql://localhost:3306/friendzonetest?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC#";
            Connection con = DriverManager.getConnection(url, "root", "password");
            System.out.println("pp");
            Statement query = con.createStatement();
            ResultSet get = query.executeQuery("SELECT email FROM logintest");
            while(get.next()){
                String email = get.getString("email");
                System.out.println(email);
            }
            con.close();
        }catch(Exception e){
            System.out.println("Error!");
        }
    }
    
}
