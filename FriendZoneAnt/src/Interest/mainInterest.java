package Interest;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class mainInterest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
//                while(true){
//            System.out.println("");
//            
//            System.out.print("\nUser 1 : ");
//            String str1 = sc.nextLine();
//            String enc = encrypt(str1);
//            System.out.print("enc user1 : " + enc);
//            String dec = decrypt(enc);
//            System.out.print("\ndec user1 : " + dec);
//            
//            System.out.println("");
//            
//            System.out.print("\nUser 2 : ");
//            String str2 = sc.nextLine();
//            String enc2 = encrypt(str2);
//            System.out.print("enc user2 : " + enc2);
//            String dec2 = decrypt(enc2);
//            System.out.print("\ndec user2 : " + dec2);
//            
//            if(str1.contains("bye")&&str2.contains("bye"))
//            break;
//        }


String[] list = {"movie", "travelling", "exercise", "dancing", "cooking", 
                 "outdoor activities", "pets", "sports", "art", "music", "learning"};

            
            
            //apez
            /*
            String[] interest;
            LinkedList<Entity> a = new LinkedList();
            String[] str = sc.nextLine().split(" ");
            interest = new String[str.length];
            for (int i = 0; i < str.length; i++) {
                int num = Integer.parseInt(str[i]);
                interest[i] = list[num-1];
            }
            
            a.add(new Entity("aku", interests(interest)));
            //System.out.println(a.toString());
            
            String[] str1 = sc.nextLine().split(" ");
            interest = new String[str1.length];
            for (int i = 0; i < str1.length; i++) {
                int num = Integer.parseInt(str1[i]);
                interest[i] = list[num-1];
            }
            a.add(new Entity("kau", interests(interest)));
            System.out.println(a.toString());
            
            int count = 0;
            for (int i = 0; i < a.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if(a.get(j).equals(a.get(i)))
                        count++;
                }
        }
            System.out.println(count);
            */
            
            //asal boleh je
            
            LinkedList ll = new LinkedList();
            LinkedList ll2 = new LinkedList();
            LinkedList ll3 = new LinkedList();
            LinkedList ll4 = new LinkedList();
                        Interests(list);
                        
            System.out.print("\nUser 1 : ");
            String[] str = sc.nextLine().split(" ");
            for (int i = 0; i < str.length; i++) {
                int num = Integer.parseInt(str[i]);
            ll.add(list[num-1]);
            }
            System.out.print("User 1 : ");
            System.out.println(ll.toString());
            
            
            System.out.print("\nUser 2 : ");
            String[] str1 = sc.nextLine().split(" ");
            for (int i = 0; i < str1.length; i++) {
                int num = Integer.parseInt(str1[i]);
            ll2.add(list[num-1]);
            }
            System.out.print("User 2 : ");
            System.out.println(ll2.toString());
            
            System.out.print("\nUser 3 : ");
            String[] str2 = sc.nextLine().split(" ");
            for (int i = 0; i < str2.length; i++) {
                int num = Integer.parseInt(str2[i]);
            ll3.add(list[num-1]);
            }
            System.out.print("User 3 : ");
            System.out.println(ll3.toString());
            
            
            System.out.print("\nUser 4 : ");
            String[] str3 = sc.nextLine().split(" ");
            for (int i = 0; i < str3.length; i++) {
                int num = Integer.parseInt(str3[i]);
            ll4.add(list[num-1]);
            }
            System.out.print("User 4 : ");
            System.out.println(ll4.toString());

            LinkedList[] link = new LinkedList[4];
            link[0] = ll;
            link[1] = ll2;
            link[2] = ll3;
            link[3] = ll4;
            
            LinkedList<Integer> kira = new LinkedList<>();
            int j=1;
            for (int i = 1; i < link.length; i++) {
            System.out.println("Interest count with user "+(++j) + " : " + isSame(ll, link[i]));
            kira.add(isSame(ll, link[i]));
        }
            String[] user = new String[3];
            user[0] = "user 2";
            user[1] = "user 3";
            user[2] = "user 4";
            bubbleSort(user,copyList(kira));
           
            }

    
    public static String changeName(String[] a){
        for (int i = 0; i < a.length; i++) {
            
            if(a[i] == a[1])
                return "User 2";
            if(a[i] == a[2])
                return "User 3";
            if(a[i] == a[3])
                return "User 4";
        }
        return "";
    }
    public static void printArray(LinkedList[] b){
    for(LinkedList i:b){
        System.out.print(i+", ");
    }
    
}
    
    public static void bubbleSort(String[] a,LinkedList list){
      int l = list.size();
     for(int i=0;i<l-1;i++){
         for(int j=0;j<l-i-1;j++){
             if((int)list.get(j)<(int)list.get(j+1)){
                 int tempo = (int)list.get(j);               
                 int c=(int)list.get(j+1);
                 
                 list.set(j,c);
                 list.set(j+1,tempo);
                 //sort String
                 String temp = a[j];
                 a[j]=a[j+1];
                 a[j+1]=temp;
                 
             }
         }
     }
     System.out.println("Sorted user according to highest interest count : ");
            for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" , ");
        }
    }
    
    public static LinkedList copyList(LinkedList list){
   LinkedList<Integer> cloneList = (LinkedList<Integer>) list.clone();
   return cloneList;
}
    
    public static String[] interests(String[] a){
        return a;
    }
    
    public static int isSame(LinkedList a, LinkedList b){
        String hobby = "";
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            hobby = (String) a.get(i);
            if(b.contains(hobby))
                count+=2;
        }
        return count;
    }
    
    public static void Interests(String[] list){
        
        int num=0;
        System.out.println("Enter the numbers that matches your interests : ");
        for (int i = 0; i < list.length; i++) {
            num++;
            System.out.print("\n"+num+" - "+list[i]);
        }
        System.out.println("");
    }
    
    
    public static String encrypt(String a){
        
        String[] str = a.split(" ");
        String enc ="";
        for (int i = 0; i < str.length; i++) {

            char c = ' ';
            for (int j = 0; j < str[i].length(); j++) {
                
                c = str[i].charAt(j);
            if(c=='a')enc += 'l';
            if(c=='A')enc += "L";
            if(c=='b')enc += "k";
            if(c=='B')enc += "K";
            if(c=='c')enc += "j";
            if(c=='C')enc += "J";
            if(c=='d')enc += "h";
            if(c=='D')enc += "H";
            if(c=='e')enc += "g";
            if(c=='E')enc += "G";
            if(c=='f')enc += "f";
            if(c=='F')enc += "F";
            if(c=='g')enc += "d";
            if(c=='G')enc += "D";
            if(c=='h')enc += "s";
            if(c=='H')enc += "S";
            if(c=='i')enc += "a";
            if(c=='I')enc += "A";
            if(c=='j')enc += "1";
            if(c=='J')enc += "1";
            if(c=='k')enc += "2";
            if(c=='K')enc += "2";
            if(c=='l')enc += "3";
            if(c=='L')enc += "3";
            if(c=='m')enc += "4";
            if(c=='M')enc += "4";
            if(c=='n')enc += "5";
            if(c=='N')enc += "5";
            if(c=='o')enc += "!";
            if(c=='O')enc += "!";
            if(c=='p')enc += "@";
            if(c=='P')enc += "@";
            if(c=='q')enc += "#";
            if(c=='Q')enc += "#";
            if(c=='r')enc += "$";
            if(c=='R')enc += "$";
            if(c=='s')enc += "%";
            if(c=='S')enc += "%";
            if(c=='t')enc += "z";
            if(c=='T')enc += "Z";
            if(c=='u')enc += "x";
            if(c=='U')enc += "X";
            if(c=='v')enc += "c";
            if(c=='V')enc += "C";
            if(c=='w')enc += "v";
            if(c=='W')enc += "V";
            if(c=='x')enc += "b";
            if(c=='X')enc += "B";
            if(c=='y')enc += "n";
            if(c=='Y')enc += "N";
            if(c=='z')enc += "m";
            if(c=='Z')enc += "M";
            
            if(c=='1')enc += "^";
            if(c=='2')enc += "&";
            if(c=='3')enc += "*";
            if(c=='4')enc += "(";
            if(c=='5')enc += ")";
            if(c=='6')enc += "q";
            if(c=='7')enc += "w";
            if(c=='8')enc += "e";
            if(c=='9')enc += "r";
            if(c=='0')enc += "t";
            
            if(c=='.')enc += "y";
            if(c=='!')enc += "u";
            if(c=='@')enc += "i";
            if(c=='#')enc += "o";
            if(c=='$')enc += "p";
            if(c=='%')enc += "6";
            if(c=='^')enc += "7";
            if(c=='&')enc += "8";
            if(c=='*')enc += "9";
            if(c=='(')enc += "0";
            if(c==')')enc += "/";
            if(c=='-')enc += "?";
            if(c=='+')enc += ".";
            if(c=='_')enc += ">";
            if(c=='=')enc += ",";
            if(c==',')enc += "<";
            if(c=='?')enc += ";";
            if(c=='/')enc += ":";
            if(c==';')enc += "\"";
            if(c==':')enc += "[";
            if(c=='"')enc += "{";
            if(c=='[')enc += "]";
            if(c==']')enc += "}";
            if(c=='{')enc += "-";
            if(c=='}')enc += "=";
            if(c=='\'')enc += "'";
            if(c=='<')enc += "Y";
            if(c=='>')enc += "U";
            if(c=='`')enc += "I";
            if(c=='~')enc += "O";
            if(c=='\\')enc += "P";
            if(c=='|')enc += "|";
            }
            enc += " ";

            
        }
        return enc;
    }
    
    public static String decrypt(String a){
        
        String[] str = a.split(" ");
        String enc ="";
        for (int i = 0; i < str.length; i++) {

            char c = ' ';
            for (int j = 0; j < str[i].length(); j++) {
                
                c = str[i].charAt(j);
            if(c=='l')enc += 'a';
            if(c=='L')enc += "A";
            if(c=='k')enc += "b";
            if(c=='K')enc += "B";
            if(c=='j')enc += "c";
            if(c=='J')enc += "C";
            if(c=='h')enc += "d";
            if(c=='H')enc += "D";
            if(c=='g')enc += "e";
            if(c=='G')enc += "E";
            if(c=='f')enc += "f";
            if(c=='F')enc += "F";
            if(c=='d')enc += "g";
            if(c=='D')enc += "G";
            if(c=='s')enc += "h";
            if(c=='S')enc += "H";
            if(c=='a')enc += "i";
            if(c=='A')enc += "I";
            if(c=='1')enc += "j";
            //if(c=='1')enc += "J";
            if(c=='2')enc += "k";
            //if(c=='2')enc += "K";
            if(c=='3')enc += "l";
            //if(c=='3')enc += "L";
            if(c=='4')enc += "m";
            //if(c=='4')enc += "M";
            if(c=='5')enc += "n";
            //if(c=='5')enc += "N";
            if(c=='!')enc += "o";
            //if(c=='!')enc += "O";
            if(c=='@')enc += "p";
            //if(c=='@')enc += "P";
            if(c=='#')enc += "q";
            //if(c=='#')enc += "Q";
            if(c=='$')enc += "r";
            //if(c=='$')enc += "R";
            if(c=='%')enc += "s";
            //if(c=='%')enc += "S";
            if(c=='z')enc += "t";
            if(c=='Z')enc += "T";
            if(c=='x')enc += "u";
            if(c=='X')enc += "U";
            if(c=='c')enc += "v";
            if(c=='C')enc += "V";
            if(c=='v')enc += "w";
            if(c=='V')enc += "W";
            if(c=='b')enc += "x";
            if(c=='B')enc += "X";
            if(c=='n')enc += "y";
            if(c=='N')enc += "Y";
            if(c=='m')enc += "z";
            if(c=='M')enc += "Z";
            
            if(c=='^')enc += "1";
            if(c=='&')enc += "2";
            if(c=='*')enc += "3";
            if(c=='(')enc += "4";
            if(c==')')enc += "5";
            if(c=='q')enc += "6";
            if(c=='w')enc += "7";
            if(c=='e')enc += "8";
            if(c=='r')enc += "9";
            if(c=='t')enc += "0";
            
            if(c=='y')enc += ".";
            if(c=='u')enc += "!";
            if(c=='i')enc += "@";
            if(c=='o')enc += "#";
            if(c=='p')enc += "$";
            if(c=='6')enc += "%";
            if(c=='7')enc += "^";
            if(c=='8')enc += "&";
            if(c=='9')enc += "*";
            if(c=='0')enc += "(";
            if(c=='/')enc += ")";
            if(c=='?')enc += "-";
            if(c=='.')enc += "+";
            if(c=='>')enc += "_";
            if(c==',')enc += "=";
            if(c=='<')enc += ",";
            if(c==';')enc += "?";
            if(c==':')enc += "/";
            if(c=='"')enc += ";";
            if(c=='[')enc += ":";
            if(c=='{')enc += "\"";
            if(c==']')enc += "[";
            if(c=='}')enc += "]";
            if(c=='-')enc += "{";
            if(c=='=')enc += "}";
            if(c=='\'') enc += "'";
            if(c=='Y')enc += "<";
            if(c=='U')enc += ">";
            if(c=='I')enc += "`";
            if(c=='O')enc += "~";
            if(c=='P')enc += "\\";
            if(c=='|')enc += "|";
            }
            enc += " ";
            
        }
        return enc;
    }
        
}
