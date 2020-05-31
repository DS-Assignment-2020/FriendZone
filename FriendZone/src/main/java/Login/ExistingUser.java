/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class ExistingUser<T>{
    
   private T email, username, password, id;
    
    public ExistingUser(T email, T password, T username,T id){
        this.username=username;
        this.email=email;
        this.password=password;
        this.id=id;
    }

    public void storeText() {
        try{
            PrintWriter store = new PrintWriter(new FileOutputStream("C:\\Users\\Owner\\Documents\\NetBeansProjects\\FriendZone\\FriendZone\\Database.txt", true));
            store.print(email+" "+password+" "+username+" "+id+"\n");
            store.close();
        }catch(IOException e){
            System.out.println("Sorry, database does not exist");
        }
    }

    
}
