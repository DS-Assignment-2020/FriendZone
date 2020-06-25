package scrapper;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Writer {
    Scrapper scrap = new Scrapper();
    BufferedWriter writer = new BufferedWriter(new FileWriter("antonyms.txt", true));
    private static List<String> adj = new ArrayList<>();
    
    public Writer() throws IOException {
    }
    
    public void WriteToFile() throws IOException{
        try {
            Scanner s = new Scanner(new FileInputStream("31K verbs.txt"));
            
            while (s.hasNextLine()) {
                String line = s.nextLine();
                adj.add(line);
            }
            

        } catch (FileNotFoundException e) {
            System.out.println("File was not found.");
        }
        
//        for(int i=0; i<adj.size(); i++){
//            scrap.fetch("https://www.thesaurus.com/browse/" + adj.get(i));
//            writer.write(adj.get(i) + "#" + scrap.getAntonym());
//        }
        scrap.fetch("https://www.thesaurus.com/browse/" + adj.get(0));
            writer.write(adj.get(0) + "#" + scrap.getAntonym());
            writer.write(System.lineSeparator());
        writer.close();
    }
}
