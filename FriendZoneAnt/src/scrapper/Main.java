package scrapper;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<String> adj = new ArrayList<>();
            
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("antonyms.txt", true));
        
        try {
            Scanner s = new Scanner(new FileInputStream("31K verbs.txt"));
            
            while (s.hasNextLine()) {
                String line = s.nextLine();
                adj.add(line);
            }
            

        } catch (FileNotFoundException e) {
            System.out.println("File was not found.");
        }
        Scrapper scrap = new Scrapper();
        
//        for(int i=0; i<adj.size(); i++){
//            scrap.fetch("https://www.thesaurus.com/browse/" + adj.get(i));
//        }
//        scrap.fetch("https://www.thesaurus.com/browse/" + adj.get(0));
//        System.out.println(scrap.getAntonym());
    
//        for(int i=0; i<adj.size(); i++){
//            scrap.fetch("https://www.thesaurus.com/browse/" + adj.get(i));
//            writer.write(adj.get(i) + "#" + scrap.getAntonym());
//        }
        for(int i=0; i<adj.size(); i++){
            scrap.fetch("https://www.thesaurus.com/browse/" + adj.get(i));
            writer.write(adj.get(i) + "#" + scrap.getAntonym());
            writer.write(System.lineSeparator());
            //Thread.sleep(100);
            System.out.println(adj.get(i) + "#" + scrap.getAntonym());
        }
        writer.close();
    }
}
