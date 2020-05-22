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
public class UserInfo<T> implements Info{
    private T email, username, password;
    private String id;
    
    public UserInfo(T username, T password, T email){
        this.username=username;
        this.email=email;
        this.password=password;
        id = getID();
        storeText();
    }

    @Override
    public void storeText() {
        try{
            PrintWriter store = new PrintWriter(new FileOutputStream("C:\\Users\\Owner\\Documents\\NetBeansProjects\\FriendZone\\Database.txt", true));
            store.print(email+" "+username+" "+password+" "+id+"\n");
            store.close();
        }catch(IOException e){
            System.out.println("Sorry, database does not exist");
        }
    }

    @Override
    public String getID() {
        String lastID = "";
        try{
            Scanner read = new Scanner(new FileInputStream("C:\\Users\\Owner\\Documents\\NetBeansProjects\\FriendZone\\Database.txt"));
  
            while(read.hasNextLine()){
                String currentLine = "";
                currentLine = read.nextLine();
                String [] info = currentLine.split(" ");
                lastID = info[info.length-1];
            }
           read.close(); 
        }catch(FileNotFoundException e){
            System.out.println("Sorry, database could not be retrieved");
        }
        int ID = Integer.parseInt(lastID) + 1;
        lastID = Integer.toString(ID);
        String finalID="";
        for(int i=0;i<4;i++){
            if(i<(4-lastID.length())){
                finalID += "0";
            }else
                finalID += lastID;
        }
        
        return finalID;
    }
    
}
