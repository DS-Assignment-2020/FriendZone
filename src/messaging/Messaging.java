package messaging;


import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Messaging {

    public static void main(String[] args) throws FileNotFoundException {
        Compare c = new Compare();
        Scanner s = new Scanner(System.in);
        System.out.print("User 1: ");
        String user1 = s.nextLine();
        System.out.println(c.CompareVAdj(user1));
    }
    
}
