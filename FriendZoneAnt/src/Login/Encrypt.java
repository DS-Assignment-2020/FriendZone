/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

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
}
