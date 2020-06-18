package Chatsystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TrollMessage {

    public TrollMessage() {

    }

    public String CompareVAdj(String input) throws FileNotFoundException {
        char[] inputarr = input.toCharArray();

        Random r = new Random();

        String aftercompare = "";

        String alpha = "abcdefghijklmnopgrstuvwxyz-";
        String tocompare = "";
        aftercompare = "";

        for (int i = 0; i < inputarr.length; i++) {
            String c = Character.toString(inputarr[i]);
            String temp = c.toLowerCase();
            if (alpha.contains(temp) == true) {
                tocompare += c;
            } else {

                if (tocompare.equals("")) {
                    aftercompare += c;
                } else if (!tocompare.equals("")) {
                    Scanner s = new Scanner(new FileInputStream("antonyms.txt"));
                    while (s.hasNextLine()) {
                        String line = s.nextLine();
                        String[] adj = line.toLowerCase().split("#");
                        if (adj.length < 2) {
                            continue;
                        }
                        if (tocompare.toLowerCase().equals(adj[0])) {
                            if (adj[1].contains(" ") == true) {
                                String[] antonym = adj[1].split(" ");
                                int num = r.nextInt(antonym.length);
                                String comparing = firstcharuppercase(tocompare);
                                if (tocompare.equals(tocompare.toLowerCase())) {
                                    aftercompare += antonym[num].toLowerCase();
                                }
                                else if (tocompare.equals(tocompare.toUpperCase())) {
                                    aftercompare += antonym[num].toUpperCase();
                                }
                                else if (tocompare.equals(comparing)) {
                                    aftercompare += firstcharuppercase(antonym[num]);
                                }
                                else{
                                    aftercompare += antonym[num].toLowerCase();
                                }

                            } else {
                                String comparing = firstcharuppercase(tocompare);
                                if (tocompare.equals(tocompare.toLowerCase())) {
                                    aftercompare += adj[1].toLowerCase();
                                }
                                else if (tocompare.equals(tocompare.toUpperCase())) {
                                    aftercompare += adj[1].toUpperCase();
                                }
                                else if (tocompare.equals(comparing)) {
                                    aftercompare += firstcharuppercase(adj[1]);
                                }
                                else{
                                    aftercompare += adj[1].toLowerCase();
                                }
                            }
                            tocompare = "";
                            aftercompare += c;
                            //System.out.println("After compare:" + aftercompare);
                            break;
                        }
                    }
                    if (!tocompare.equals("")) {
                        aftercompare += tocompare;
                        aftercompare += c;
                        tocompare = "";
                    }
                }

            }

        }
        if (!tocompare.equals("")) {
            Scanner s = new Scanner(new FileInputStream("antonyms.txt"));
            while (s.hasNextLine()) {
                String line = s.nextLine();
                String[] adj = line.toLowerCase().split("#");
                if (adj.length < 2) {
                    continue;
                }
                if (tocompare.toLowerCase().equals(adj[0])) {
                    //System.out.println("point");
                    if (adj[1].contains(" ") == true) {
                        String[] antonym = adj[1].split(" ");
                        int num = r.nextInt(antonym.length);
                        String comparing = firstcharuppercase(tocompare);
                        if (tocompare.equals(tocompare.toLowerCase())) {
                            aftercompare += antonym[num].toLowerCase();
                            //System.out.println("run1");
                        }
                        else if (tocompare.equals(tocompare.toUpperCase())) {
                            aftercompare += antonym[num].toUpperCase();
                            //System.out.println("run2");
                        }
                        else if (tocompare.equals(comparing)) {
                            aftercompare += firstcharuppercase(antonym[num]);
                            //System.out.println("run3");
                        }
                        else{
                            aftercompare += antonym[num].toLowerCase();
                        }

                    } else {
                        String comparing = firstcharuppercase(tocompare);
                        if (tocompare.equals(tocompare.toLowerCase())) {
                            aftercompare += adj[1].toLowerCase();
                        }
                        else if (tocompare.equals(tocompare.toUpperCase())) {
                            aftercompare += adj[1].toUpperCase();
                        }
                        else if (tocompare.equals(comparing)) {
                            aftercompare += firstcharuppercase(adj[1]);
                        }
                        else{
                            aftercompare += adj[1].toLowerCase();
                            }
                    }
                    tocompare = "";
                    break;
                }

//            if (input.contains(adj[0]) == true) {
//                if (adj[1].contains(" ")) {
//                    String[] antonym = adj[1].split(" ");
//                    int num = r.nextInt(antonym.length);
//
//                    input = input.replaceAll(adj[0], antonym[num]);
//                    System.out.println(input);
//                } else {
//                    input = input.replaceAll(adj[0], adj[1]);
//                    System.out.println(input);
//                }
//            }
//            for (int i=0; i<inputarr.length; i++){
//                if(inputarr[i].equalsIgnoreCase(adj[0])){
//                    if(adj[1].contains(" ")){
//                        String[] antonym = adj[1].split(" ");
//                        int num = r.nextInt(antonym.length);
//                        inputarr[i] = antonym[num];
//                    }
//                    else {
//                        inputarr[i] = adj[1];
//                    }
//                }
//            }
            }
            if (!tocompare.equals("")) {
                aftercompare += tocompare;
                tocompare = "";
            }
        }
        return aftercompare;
    }

//    public String FindAntonym(String a) {
//
//    }
    public String firstcharuppercase(String a) {
        char[] c = a.toCharArray();
        String temp = Character.toString(c[0]).toUpperCase();
        for (int j = 1; j < c.length; j++) {
            temp += Character.toString(c[j]).toLowerCase();
        }
        return temp;
    }
}
