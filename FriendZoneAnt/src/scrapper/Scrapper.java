package scrapper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Scrapper {

   private static Scrapper mInstance;
   private Document doc;
   //private String url;
   
    public void fetch(String url) {
        
        try {
            doc = Jsoup.connect(url).ignoreHttpErrors(true).get();

        } catch (IOException e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }

    protected String getAntonym() {
        
        String antonym = doc.select("a[class=css-lqr09m-ItemAnchor etbu2a31]").text();
        return antonym;
        
    }
        //String desc = doc.select(".content-text").select("p").text();
        //print("The descrption: " + desc);

//    protected void printAllCountries() {
//        Elements countries = doc.select("ul.column").select("li:not(.letter)");
//        for(Element el: countries) {
//            print(el.text());
//        }
//    }
//
//    protected void printCountriesByFirstLetter(String letter) {
//        Elements countriesByLetter = doc.select("ul.column").select("li:not(.letter)").select("li:matches(^"+letter.toUpperCase()+")");
//
//        print("Countries by letter " + letter +": ");
//        for(Element el: countriesByLetter) {
//            print(el.text());
//        }
//    }

//    private void print(String s){
//        System.out.println(s);
//    }


//    public static Scrapper getmInstance(){
//        if(mInstance == null) {
//            mInstance = new Scrapper();
//        }
//        return mInstance;
//    }
}