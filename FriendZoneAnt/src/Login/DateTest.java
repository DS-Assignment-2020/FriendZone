/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Owner
 */
public class DateTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
        String date = str1.toString();
        String time = str2.toString();
        System.out.println(date);
        System.out.println(time);
    }
    
}
