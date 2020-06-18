/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import static Coordinates.DistanceCalc.find;
import static Coordinates.DistanceCalc.findMaxRange;
import static Coordinates.DistanceCalc.getGender;
import static Coordinates.DistanceCalc.getLatitudeandLongitude;
import static Coordinates.DistanceCalc.getUsername;
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
    private static HttpURLConnection connection;
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

        nearbyMAX = findMaxRange(lat_lng.get(0),lat_lng.get(1),gender);// the username of the user who wants to search around himself/herself
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
            ResultSet rs = query.executeQuery("SELECT gender FROM signup WHERE specialid = '00000001';");
            while ( rs.next() ) {
                gender = rs.getString("gender");
            }
            conn.close();
        }catch(Exception e){
            System.out.println("Error!");
        }
        
        return gender;
    }
    
    public static LinkedList<String> getSpecialID(String gender){
        LinkedList<String> specialid = new LinkedList<>();
        try{
            String url = "jdbc:mysql://34.87.155.63:3306/friendzone?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection conn = DriverManager.getConnection(url, "root", "password");
            Statement query = conn.createStatement();
            ResultSet rs = query.executeQuery("SELECT specialid FROM signup WHERE gender = '"+gender+"';");
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
        String loc = "";
        String [] location;
        try{
            String url = "jdbc:mysql://34.87.155.63:3306/friendzone?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection conn = DriverManager.getConnection(url, "root", "password");
            Statement query = conn.createStatement();
            ResultSet rs = query.executeQuery("SELECT location FROM signup WHERE specialid = '"+specialid+"';");
            while ( rs.next() ) {
                loc = rs.getString("location");
            }
            location = loc.split(" ");
            loc = "";
            for(int i=0;i<location.length;i++){
                if(i==location.length-1){
                    loc+=location[i];
                    break;
                }
                loc += location[i] + "+";
            }
            conn.close();
        }catch(Exception e){
            System.out.println("Error!");
        }
        
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();

        try{
            URL url1 = new URL("https://maps.googleapis.com/maps/api/geocode/json?address="+loc+"&key=AIzaSyCcMsn0tbVUpSBp-DHGropQkZj--nJ4uq0");
            connection =  (HttpURLConnection) url1.openConnection();
            
            //request setup
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();
            //System.out.println(status);
            if(status>299){
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while((line = reader.readLine())!=null){
                    responseContent.append(line);
                }
                reader.close();
            }else{
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while((line = reader.readLine())!=null){
                    responseContent.append(line);
                    responseContent.append("\n");
                }
                reader.close();
            }
            String jsonresponse = responseContent.toString();
            lat_lng = parse(jsonresponse);
            
        }catch(MalformedURLException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            connection.disconnect();
        }
        return lat_lng;
    }
    
    public static LinkedList<Double> parse(String responseBody){
        LinkedList<Double> lat_lng = new LinkedList<>();
       JSONObject passValue = new JSONObject(responseBody);
        JSONObject a = passValue.getJSONArray("results").getJSONObject(0).getJSONObject("geometry").getJSONObject("location");
        double lat = a.getDouble("lat");
        double lng = a.getDouble("lng");
        lat_lng.add(a.getDouble("lat"));
        lat_lng.add(a.getDouble("lng"));
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


    public static LinkedList<String> findMaxRange(double this_x,double this_y,String this_gender){
        String gender = "";
        if(this_gender.equals("M"))
            gender = "F";
        else 
            gender = "M";
        int x,y;
        LinkedList<String> potentialpartners = new LinkedList<>();
        LinkedList<String> usernameFound = new LinkedList<>();

        potentialpartners = getSpecialID(gender);
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
