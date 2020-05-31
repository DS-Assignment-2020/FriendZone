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
public class UserInfo<T,K> implements Info{
    private T email, username, password;
    private String id;
    private K gender;
    
    public UserInfo(T email, T password, T username,K gender){
        this.username=username;
        this.email=email;
        this.password=password;
        this.gender=gender;
        id = getID();
    }

    @Override
    public void storeText() {
        try{
            PrintWriter store = new PrintWriter(new FileOutputStream("Database.txt", true));
            store.print(email+" "+password+" "+username+" "+gender+" "+id+"\n");
            store.close();
        }catch(IOException e){
            System.out.println("Sorry, database does not exist");
        }
    }

    @Override
    public String getID() {
        String lastID = "";
        try{
            Scanner read = new Scanner(new FileInputStream("Database.txt"));
  
            while(read.hasNextLine()){
                String currentLine = "";
                currentLine = read.nextLine();
                String [] info = currentLine.split(" ");
                if(lastID.equals(""))
                    lastID = "0000";
                if(Integer.parseInt(info[info.length-1])>Integer.parseInt(lastID))
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
