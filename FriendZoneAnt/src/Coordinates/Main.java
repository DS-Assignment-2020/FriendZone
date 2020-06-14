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
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;


public class Main {

    static final int MAX_r = 5000; //distance unit in meter

    public static void main(String[] args) throws IOException {

        LinkedList<String> nearbyMAX = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username : ");
        String username = sc.nextLine();

        int this_x = 0;
        int this_y = 0;
        char this_gender ='X';
        String name = "";
        try {
            Scanner scn = new Scanner(new FileInputStream("Database.txt"));
            while (scn.hasNextLine()) {
                String[] otherUser = scn.nextLine().split(" ");
                if(username.equals(otherUser[2])){
                    this_x = Integer.parseInt(otherUser[5]);
                    this_y = Integer.parseInt(otherUser[6]);
                    this_gender = otherUser[3].charAt(0);
                    break;
                }
            }
            scn.close();
        } catch (FileNotFoundException e) {
            System.out.println("Database not available.");
        }
        
        nearbyMAX = findMaxRange(username,this_x,this_y,this_gender);// the username of the user who wants to search around himself/herself
                                                                    // return the LinkedList of usernames of user in the Max_r
        System.out.println(nearbyMAX.toString());


        System.out.print("Enter the range you want to search : (500,1000,1500,2000,...,5000): ");
        int range = sc.nextInt();
        LinkedList<String> nearbyCertainRange = new LinkedList<>();
        nearbyCertainRange = find(nearbyMAX,range,this_x,this_y);
        System.out.println("The user found in "+ range+" is : "+ nearbyCertainRange);

    }

    //*************NEW METHOD*****************

    public static boolean withinRange(int x1,int y1, int x2,int y2,int range){
        int result = (int) Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println(result);// this line -just to see how is the program running, need to be removed when no more error
        return result <= range;
    }


    public static LinkedList<String> findMaxRange(String username,int this_x,int this_y,char this_gender){

        System.out.println("This_x,This_y : "+ this_x + "," + this_y);
        int x,y;
        LinkedList<String> usernameFound = new LinkedList<>();
        int range = 500;
        int count = 0;
        //while (range < MAX_r) {
            //if(range >= MAX_r)
             //   break;
            try {
                Scanner scn = new Scanner(new FileInputStream("Database.txt"));
                while (scn.hasNextLine()) {
                    String str = scn.nextLine();
//                    count++; ///
                    System.out.println(count);
                    System.out.println("Line "+ count); ///
                    String[] otherUser = str.split(" ");
                    if(otherUser.length >= 7) {
                        // name = otherUser[2];
                        if (otherUser[3].charAt(0) != this_gender) { // IGNORE : ************IndexOutOf Bound
                            System.out.println("Different gender"); // Just to see if this code runs, need to be deleted later
                            x = Integer.parseInt(otherUser[5]); //coor x
                            y = Integer.parseInt(otherUser[6]); //coor y
                            if (withinRange(this_x, this_y, x, y, MAX_r)) { // different gender and within the maximum range
                                //System.out.println(name); // this line - just to see how is the program running, need to be removed when no more error
                                usernameFound.add(otherUser[2]); // add the username of user that is in the range to LinkedList
                            }
                        }
                    }
                    count++;
                }
                scn.close();
            } catch (FileNotFoundException e) {
                System.out.println("Database not available 2.");
            }
          //  range += 500;
       // }
        return usernameFound;
    }

    public static LinkedList<String> find(LinkedList<String> usernames,int range,int this_x,int this_y){
        int x;
        int y;
        LinkedList<String> userWithinCertainRange = new LinkedList<>();
        if(range > MAX_r)
            return null;
        else{
            try {
                Scanner scn = new Scanner(new FileInputStream("Database.txt"));
                while (scn.hasNextLine()) {
                    String[] otherUser = scn.nextLine().split(" ");
                    if(otherUser.length>=7  && usernames.contains(otherUser[2])){
                        x = Integer.parseInt(otherUser[5]); //coor x
                        y = Integer.parseInt(otherUser[6]); //coor y
                        if(withinRange(this_x,this_y,x,y,range)){
                            userWithinCertainRange.add(otherUser[2]);
                        }
                    }
                }
                scn.close();
            } catch (FileNotFoundException e) {
                System.out.println("Database not available.");
            }
        }
        return userWithinCertainRange;
    }

}
