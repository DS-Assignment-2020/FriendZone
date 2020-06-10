/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coordinates;

/**
 *
 * @author Owner
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    static final int MAX_r = 2000; //distance unit in meter
    static int r = 1000; //starting search distance

    public static void main(String[] args) {

        User u1 = new User("Alex","M",5.34,6.23);
        User u2 = new User("Bob","M",65.37,90.22);
        User u3 = new User("James","M",1300.21,239.80);
        User u4 = new User("Cindy","F",3113.63,2034.21);
        User u5 = new User("Anne","F",983.23,3123.45);
        User u6 = new User("Tiffany","F",24.65,89.56);

        //my user class should be modified some more

        User[] userArr = {u1,u2,u3,u4,u5,u6};

        try {
            PrintWriter p = new PrintWriter(new FileOutputStream("Users.txt"));
            for(int i=0;i<userArr.length;i++){
                p.println(userArr[i].toString());
            }
            p.close();
        }catch (FileNotFoundException e){
            System.out.println("File was not found.");
        }

        
    }

    public static String[] findUserNearMe(User us){
        double coor_xThisUser = us.getCoor_x();
        double coor_yThisUser = us.getCoor_y();
        String genderThisUser = us.getGender();
        String[] userFound = new String[6]; //should modify the size to follow the number of users

        int count = 0;
        try {
            Scanner sc = new Scanner(new FileInputStream("Users.txt")); //should be changed to Database.txt
            while(sc.hasNextLine()){
                String temp = sc.nextLine();
                String[] userInfo = temp.split(" ");
                if(!genderThisUser.equals(userInfo[1])){ // the index haven't been updated based on the Database.txt
                    double x = Double.parseDouble(userInfo[2]);
                    double y = Double.parseDouble(userInfo[3]);
                    if(within1000(coor_xThisUser,coor_yThisUser,x,y)){
                        userFound[count] = temp;
                        count ++;
                    }
                }
            }
            sc.close();
        }catch (FileNotFoundException e){
            System.out.println("File was not found.");
        }

        if(count == 0){
            try {
                Scanner sc = new Scanner(new FileInputStream("Users.txt")); //should be changed to Database.txt
                while(sc.hasNextLine()){
                    String temp = sc.nextLine();
                    String[] userInfo = temp.split(" ");
                    if(!genderThisUser.equals(userInfo[1])){ // the index haven't been updated based on the Database.txt
                        double x = Double.parseDouble(userInfo[2]);
                        double y = Double.parseDouble(userInfo[3]);
                        if(within2000(coor_xThisUser,coor_yThisUser,x,y)){
                            userFound[count] = temp;
                            count ++;
                        }
                    }
                }
                sc.close();
            }catch (FileNotFoundException e){
                System.out.println("File was not found.");
            }
        }

        return userFound;
    }

    public static boolean within1000(double x1,double y1,double x2,double y2){
        double result = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        if(result <= r){
            return true;
        }
        return false;
    }

    public static boolean within2000(double x1,double y1,double x2,double y2){
        double result = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        if(result <= MAX_r){
            return true;
        }
        return false;
    }
}
