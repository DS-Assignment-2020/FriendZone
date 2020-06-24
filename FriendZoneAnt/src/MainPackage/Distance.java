/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

//import static Coordinates.DistanceCalc.find;
//import static Coordinates.DistanceCalc.findMaxRange;
//import static Coordinates.DistanceCalc.getGender;
//import static Coordinates.DistanceCalc.getLatitudeandLongitude;
//import static Coordinates.DistanceCalc.getUsername;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.Scanner;
import org.json.JSONObject;

/**
 *
 * @author Owner
 */
public class Distance {
    
    static final int MAX_r = 20000; //distance unit in meter
    private int range;
    private String specialid;
    
    public Distance(int range,String specialid){
        this.range=range;
        this.specialid=specialid;
    }
    
    public LinkedList<String> Main(){
         LinkedList<String> nearbyMAX = new LinkedList<>();
        String gender = getGender(specialid);
        LinkedList<Double> lat_lng = getLatitudeandLongitude(specialid);

        nearbyMAX = findMaxRange(lat_lng.get(0),lat_lng.get(1),specialid);// the username of the user who wants to search around himself/herself
                                                                    // return the LinkedList of usernames of user in the Max_r
//        System.out.println(nearbyMAX.toString());

        LinkedList<String> nearbyCertainRange = new LinkedList<>();
        nearbyCertainRange = find(nearbyMAX,range,lat_lng.get(0),lat_lng.get(1));
//        LinkedList<String> username = getUsername(nearbyCertainRange);
//        System.out.println("The user found in "+ range+" is : "+ username);
        return nearbyCertainRange;
    }
    
    public static String getGender(String specialid){
         String gender = "";
        try{
            String url = "jdbc:mysql://34.87.155.63:3306/friendzone?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection conn = DriverManager.getConnection(url, "root", "password");
            Statement query = conn.createStatement();
            ResultSet rs = query.executeQuery("SELECT gender FROM signup WHERE specialid = '"+specialid+"';");
            while ( rs.next() ) {
                gender = rs.getString("gender");
            }
            conn.close();
        }catch(Exception e){
            System.out.println("Error!");
        }
        
        return gender;
    }
    
    public static LinkedList<String> getSpecialID(String id){
        LinkedList<String> specialid = new LinkedList<>();
        try{
            String url = "jdbc:mysql://34.87.155.63:3306/friendzone?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection conn = DriverManager.getConnection(url, "root", "password");
            Statement query = conn.createStatement();
            ResultSet rs = query.executeQuery("SELECT specialid FROM signup WHERE specialid <> '"+id+"';");
            while ( rs.next() ) {
                specialid.add(rs.getString("specialid"));
            }
            conn.close();
        }catch(Exception e){
            System.out.println("Error!");
        }
        
        return specialid;
    }
    
    public static LinkedList<Double> getLatitudeandLongitude(String specialid){
        LinkedList<Double> lat_lng = new LinkedList<>();

        try{
            String url = "jdbc:mysql://34.87.155.63:3306/friendzone?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection conn = DriverManager.getConnection(url, "root", "password");
            Statement query = conn.createStatement();
            ResultSet rs = query.executeQuery("SELECT latitude,longitude FROM signup WHERE specialid = '"+specialid+"';");
            while ( rs.next() ) {
                lat_lng.add(rs.getDouble("latitude"));
                lat_lng.add(rs.getDouble("longitude"));
            }
            
            conn.close();
        }catch(Exception e){
            System.out.println("Error!");
        }
        
        return lat_lng;
    }

    //*************NEW METHOD*****************
    
     public static boolean distFrom(double lat1, double lng1, double lat2, double lng2, int range) {
        float max_range = (float) range;
        double earthRadius = 6371000; //meters
        double dLat = Math.toRadians(lat2-lat1);
        double dLng = Math.toRadians(lng2-lng1);
        double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
                   Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
                   Math.sin(dLng/2) * Math.sin(dLng/2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double dist = (double) (earthRadius * c);
        return dist<=max_range;
    }


    public static LinkedList<String> findMaxRange(double this_x,double this_y,String specialid){
//        String gender = "";
//        if(this_gender.equals("M"))
//            gender = "F";
//        else 
//            gender = "M";
        int x,y;
        LinkedList<String> potentialpartners = new LinkedList<>();
        LinkedList<String> usernameFound = new LinkedList<>();

        potentialpartners = getSpecialID(specialid);
        LinkedList<Double> partner_lat_lng;
        for(int i=0;i<potentialpartners.size();i++){
            partner_lat_lng = getLatitudeandLongitude(potentialpartners.get(i));
            if(distFrom(this_x,this_y,partner_lat_lng.get(0),partner_lat_lng.get(1),MAX_r)){
                usernameFound.add(potentialpartners.get(i));
            }
        }
        return usernameFound;
    }
    
    public static LinkedList<String> getUsername(LinkedList<String> specialid){
        LinkedList<String> username = new LinkedList<>();
        try{
            String url = "jdbc:mysql://34.87.155.63:3306/friendzone?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection conn = DriverManager.getConnection(url, "root", "password");
            Statement query = conn.createStatement();
            for(int i=0;i<specialid.size();i++){
                ResultSet rs = query.executeQuery("SELECT username FROM signup WHERE specialid = '"+specialid.get(i)+"';");
            while ( rs.next() ) {
                username.add(rs.getString("username"));
            }
            }
            conn.close();
        }catch(Exception e){
            System.out.println("Error!");
        }
        
        return username;
    }

    public static LinkedList<String> find(LinkedList<String> specialid,int range,double this_x,double this_y){
        int x;
        int y;
        LinkedList<String> userWithinCertainRange = new LinkedList<>();
        LinkedList<Double> lat_lng; 
        if(range > MAX_r)
            return null;
        else{
//            try {
//                Scanner scn = new Scanner(new FileInputStream("Database.txt"));
//                while (scn.hasNextLine()) {
//                    String[] otherUser = scn.nextLine().split(" ");
//                    if(otherUser.length>=7  && usernames.contains(otherUser[2])){
//                        x = Integer.parseInt(otherUser[5]); //coor x
//                        y = Integer.parseInt(otherUser[6]); //coor y
//                        if(distFrom(this_x,this_y,x,y,range)){
//                            userWithinCertainRange.add(otherUser[2]);
//                        }
//                    }
//                }
//                scn.close();
//            } catch (FileNotFoundException e) {
//                System.out.println("Database not available.");
//            }
            for(int i=0;i<specialid.size();i++){
                lat_lng = getLatitudeandLongitude(specialid.get(i));
                if(distFrom(this_x,this_y,lat_lng.get(0),lat_lng.get(1),range)){
                userWithinCertainRange.add(specialid.get(i));
            }
            }
        }
        return userWithinCertainRange;
    }
}
