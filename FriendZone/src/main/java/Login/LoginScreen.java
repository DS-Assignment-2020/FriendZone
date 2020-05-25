/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class LoginScreen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Sign Up/Login\n[S/L] ");
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        Scanner d = new Scanner(System.in);
        Character input = a.next().charAt(0);
        if(input=='S'||input=='s'){
            System.out.print("E-mail: ");
            String email = a.next();
            System.out.print("Username: ");
            String username = b.nextLine();
            System.out.print("Password: ");
            String password = c.next();
            UserInfo<String> user = new UserInfo(username,password,email);
            user.storeText();
            
        }else if(input=='L'||input=='l'){
            System.out.print("E-mail: ");
            String email = d.nextLine();
            System.out.print("Password: ");
            String password = b.next();
            System.out.print("New Username: ");
            String new_username = c.nextLine();
            String userID = checkLogin(email,password);
            if(userID.length()==4){
               ExistingUser user = new ExistingUser(email,password,new_username,userID);
               user.storeText();
            }else
                System.out.println(userID);
        }
    }
    
    public static String checkLogin(String email,String password){
        try{
            Scanner scan = new Scanner(new FileInputStream("C:\\Users\\Owner\\Documents\\NetBeansProjects\\FriendZone\\FriendZone\\Database.txt")); 
            Scanner f = new Scanner(System.in);
            System.out.print("Would you like to register a new account? [Y/N] ");
            Character input = f.next().charAt(0);
            if(input=='Y'||input=='y'){
                while(scan.hasNextLine()){
                    String line = scan.nextLine();
                    String [] userinfo = line.split(" ");
                    if(userinfo[0].equalsIgnoreCase(email)){
                        int count=0;
                        while(true){
                            if(count==3)
                                return "You have exceeded the number of password attempts. Please refresh the program to try again";
                            else if(!password.equalsIgnoreCase(userinfo[1])){
                                System.out.print("Password: ");
                                password = f.next();
                                count++;
                            }else
                                break;
                        }
                        return userinfo[userinfo.length-1];
                    }
                }
            }
            }catch(FileNotFoundException e){
                System.out.println("Sorry, database could not be retrieved");
            }
        
        return "Sorry, your details do not exist in our database. Please sign-up for an account.";
    }
    
}
