/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import static Interest.mainInterest.bubbleSort1;
import static Interest.mainInterest.isSame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author Owner
 */
public class sortedInterest {
    
    LinkedList<String> partners;
    
    public sortedInterest(LinkedList<String> partners){
        this.partners=partners;
    }
    
    public  LinkedList<String> getPartners(){
        int[] in = new int[partners.size()];
        String[] str = new String[partners.size()];
//        System.out.println("User interest(00000019) : "+getInterests("00000019"));
        for (int i = 0; i < partners.size(); i++) {
//            System.out.println(partners.get(i)+" "+getInterests(partners.get(i)));
            in[i] = isSame(getInterests("00000019"),getInterests(partners.get(i)));
            str[i] = partners.get(i);
//            System.out.println(isSame(getInterests("00000019"),getInterests(partners.get(i))));
        }
            
            LinkedList<String> sorted = new LinkedList<>();
//        System.out.println("Sorted user : ");
        for (int i = 0; i < partners.size(); i++) {
            bubbleSort1(in,str);
            sorted.add(str[i]);
//            System.out.print(str[i]+",");
            
        }
//        System.out.print("\n"+sorted.toString()+" ");
        
        return sorted;
    }
    
     public static LinkedList<String> getInterests(String specialid){
        LinkedList<String> interests = new LinkedList<>();
         try{
            String url = "jdbc:mysql://34.87.155.63:3306/friendzone?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Connection conn = DriverManager.getConnection(url, "root", "password");
            Statement query = conn.createStatement();
            ResultSet rs = query.executeQuery("SELECT interest FROM interestexample WHERE specialid = '"+specialid+"'");
            while ( rs.next() ) {
                String interest = rs.getString("interest");
                interests.add(interest);
            }
            conn.close();
        }catch(Exception e){
            System.out.println("Error!");
             System.out.println(e.getMessage());
        }
         return interests;
    }
}
