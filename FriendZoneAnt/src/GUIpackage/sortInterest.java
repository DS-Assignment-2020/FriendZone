/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIpackage;
import static Interest.mainInterest.bubbleSort1;
import static Interest.mainInterest.isSame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class sortInterest {

    
    
    
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
    
    
    public static void Main(){
        String[] list = {"movie", "travelling", "exercise", "dancing", "cooking", 
                 "outdoor activities", "pets", "sports", "art", "music", "learning"};

            //ll for user(fix) - interests
            //another ll client(new user) - interests
            //Linekdlist for user(fixed)
            LinkedList owner = new LinkedList();
            Scanner sc = new Scanner(System.in);
            System.out.print("\nOwner : ");
            String[] str = sc.nextLine().split(" ");
            for (int i = 0; i < str.length; i++) {
                int num = Integer.parseInt(str[i]);
            owner.add(list[num-1]);
            }
            System.out.print("Owner : ");
            System.out.println(owner.toString());


            //tiap kali loop,user baru,store interest,compare,print,clear
            
            int user = 4;
            String[] ari=new String[user];
            LinkedList client = new LinkedList();
            int a = 0;
            //loop berapa user
            String string="";
            String org = "";
            String[] keep = new String[user];
            for (int i = 0; i < user; i++) {
                a++;
                
                System.out.print("User "+a+" : ");
                org = "User "+a;
                keep[i] = org;
                //loop utk minta interest
                String[] str1 = sc.nextLine().split(" ");
                for (int j = 0; j < str1.length; j++) {
                int num = Integer.parseInt(str1[j]);
                client.add(list[num-1]);
            } 
                System.out.println("user "+a+" : "+client.toString());
                System.out.println("Interest count with user "+(a) + " : " + isSame(owner, client));
                string="User "+a+":"+isSame(owner, client);
                ari[i]=string;      //{"user 1: 3", "user 2 : 1"}
                client.clear();
            }
            
             
            int[] bosq=new int[user];
            int max=0;
            for (int i = 0; i < user; i++) {
            String[] v = ari[i].split(":");     //take count je
            bosq[i]=Integer.parseInt(v[1]);
            
        }
            System.out.print("Sorted user : ");
            for (int i = 0; i < user; i++) {
                bubbleSort1(bosq,keep);
                System.out.print(keep[i]+", ");
        }
    }
    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("00000004");
        list.add("00000016");
        list.add("00000013");
        list.add("00000020");
        int[] in = new int[list.size()];
        String[] str = new String[list.size()];
        System.out.println("User interest(00000019) : "+getInterests("00000019"));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+" "+getInterests(list.get(i)));
            in[i] = isSame(getInterests("00000019"),getInterests(list.get(i)));
            str[i] = list.get(i);
            System.out.println(isSame(getInterests("00000019"),getInterests(list.get(i))));
        }
            
            LinkedList<String> sorted = new LinkedList<>();
        System.out.println("Sorted user : ");
        for (int i = 0; i < list.size(); i++) {
            bubbleSort1(in,str);
            sorted.add(str[i]);
            System.out.print(str[i]+",");
            
        }
        System.out.print("\n"+sorted.toString()+" ");

    }
    
}
