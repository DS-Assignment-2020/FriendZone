/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class ChatTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
        Scanner b= new Scanner(System.in);
        String client1input;
        while(true){
            System.out.print("Client 1: ");
           client1input = a.nextLine();
            System.out.println(getSequence());
        }
    }
    
    public String[] DateAndTime(){
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        System.out.println(timeStamp);
        String [] date_time = timeStamp.split("\\_");
        StringBuilder str1 = new StringBuilder(date_time[0]);
        StringBuilder str2 = new StringBuilder(date_time[1]);
        int j=0;
        for(int i=4;i<date_time[0].length();i+=2){
            str1.insert(i+j, '/');
            j++;
        }
        j=0;
        for(int i=2;i<date_time[1].length();i+=2){
            str2.insert(i+j, ':');
            j++;
        }
        String [] datetime = new String[2];
        datetime[0] = str1.toString();
        datetime[1] = str2.toString();
        return datetime;
    }
    
    public static int getSequence(){
        int sequence = 0;
         try{
            String url = "jdbc:mysql://34.87.155.63:3306/friendzone?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection conn = DriverManager.getConnection(url, "root", "password");
            Statement query = conn.createStatement();
            ResultSet rs = query.executeQuery("SELECT sequence FROM chatinfo WHERE client = '00000002';");
            while ( rs.next() ) {
                sequence = rs.getInt("sequence");
            }
            sequence+=1;
            conn.close();
        }catch(Exception e){
            System.out.println("Error!");
        }
         return sequence;
    }
    
}
