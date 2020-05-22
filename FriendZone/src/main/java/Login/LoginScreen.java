/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

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
        Character input = a.next().charAt(0);
        if(input=='S'||input=='s'){
            System.out.print("E-mail: ");
            String email = a.next();
            System.out.print("Username: ");
            String username = b.nextLine();
            System.out.print("Password: ");
            String password = c.next();
            UserInfo<String> user = new UserInfo(username,password,email);
        }
    }
    
}
