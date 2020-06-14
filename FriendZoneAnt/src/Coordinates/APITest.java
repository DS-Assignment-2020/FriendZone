/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coordinates;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import org.apache.commons.httpclient.HttpClient;
import org.json.JSONArray;
import org.json.JSONObject;
/**
 *
 * @author Owner
 */
public class APITest {
    
    private static HttpURLConnection connection;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();
        try{
            URL url = new URL("https://maps.googleapis.com/maps/api/geocode/json?address=KLCC+Kuala+Lumpur+Kuala+Lumpur+Malaysia&key=AIzaSyCcMsn0tbVUpSBp-DHGropQkZj--nJ4uq0");
            connection =  (HttpURLConnection) url.openConnection();
            
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
            System.out.println(responseContent.toString());
            parse(jsonresponse);
        }catch(MalformedURLException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            connection.disconnect();
        }
    }
    
    public static boolean distFrom(float lat1, float lng1, float lat2, float lng2, int range) {
        float max_range = (float) range;
        double earthRadius = 6371000; //meters
        double dLat = Math.toRadians(lat2-lat1);
        double dLng = Math.toRadians(lng2-lng1);
        double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
                   Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
                   Math.sin(dLng/2) * Math.sin(dLng/2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        float dist = (float) (earthRadius * c);

        return dist<=max_range;
    }
     
    public static String[] parse(String responseBody){
        JSONArray albums = new JSONArray(responseBody);
        for(int i=0;i<albums.length();i++){
            JSONObject album = albums.getJSONObject(i);
            float lat = album.getFloat("lat");
            System.out.println(lat);
            
        }
        
        return null;
    } 
    
//    public static String[] manualParse(String responseBody){
//        
//    }
    
}
