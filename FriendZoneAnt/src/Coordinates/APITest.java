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
import java.util.LinkedList;
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
    private static HttpURLConnection connection2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader reader;
        BufferedReader reader2;
        String line2;
        String line;
        StringBuffer responseContent = new StringBuffer();
        StringBuffer responseContent2 = new StringBuffer();
        LinkedList<Double> lat_lng2 = new LinkedList<>();
        LinkedList<Double> lat_lng = new LinkedList<>();
        try{
            URL url1 = new URL("https://maps.googleapis.com/maps/api/geocode/json?address=KLCC+Kuala+Lumpur+Kuala+Lumpur+Malaysia&key=AIzaSyCcMsn0tbVUpSBp-DHGropQkZj--nJ4uq0");
            URL url2 = new URL("https://maps.googleapis.com/maps/api/geocode/json?address=Universiti+Malaya+Malaysia&key=AIzaSyCcMsn0tbVUpSBp-DHGropQkZj--nJ4uq0");
            connection =  (HttpURLConnection) url1.openConnection();
            connection2 = (HttpURLConnection) url2.openConnection();
            
            //request setup
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            
            connection2.setRequestMethod("GET");
            connection2.setConnectTimeout(5000);
            connection2.setReadTimeout(5000);
            
            int status = connection.getResponseCode();
            int status2 = connection2.getResponseCode();
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
            lat_lng = parse(jsonresponse);
            
            if(status2>299){
                reader2 = new BufferedReader(new InputStreamReader(connection2.getErrorStream()));
                while((line2 = reader2.readLine())!=null){
                    responseContent2.append(line2);
                }
                reader2.close();
            }else{
                reader2 = new BufferedReader(new InputStreamReader(connection2.getInputStream()));
                while((line2 = reader2.readLine())!=null){
                    responseContent2.append(line2);
                    responseContent2.append("\n");
                }
                reader2.close();
            }
            String jsonresponse2 = responseContent2.toString();
            System.out.println(responseContent2.toString());
            lat_lng2 = parse(jsonresponse2);
        }catch(MalformedURLException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            connection.disconnect();
        }
        
        distFrom(lat_lng.get(0),lat_lng.get(1),lat_lng2.get(0),lat_lng2.get(1),5000);
    }
    
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
        System.out.println(dist);
        return dist<=max_range;
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
    
//    public static String[] manualParse(String responseBody){
//        
//    }
    
}
