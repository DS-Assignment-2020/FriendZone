/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;



/**
 *
 * @author Owner
 */
public class Encrypt {
    private String a;
    
    public Encrypt(String message){
        a = message;
    }
    
     public String encrypt(){
        
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
        //System.out.print(enc);
        //decrypt(enc);
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
        //System.out.print(enc);
    }
}
