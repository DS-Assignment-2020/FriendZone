/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrollMessage;

/**
 *
 * @author Owner
 */
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
