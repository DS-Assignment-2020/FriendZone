/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coordinates;

/**
 *
 * @author Owner
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class ExistingUser<T,K> {
    private T email, username, password, id;
    private K gender;
    private int x,y;
    Random rand = new Random();

    public ExistingUser(T email, T password, T username,K gender,T id){
        this.username=username;
        this.email=email;
        this.password=password;
        this.id=id;
        this.gender=gender;
        x = rand.nextInt(10000);
        y = rand.nextInt(10000);
    }

    public void storeText() {
        try{
            PrintWriter store = new PrintWriter(new FileOutputStream("Database.txt", true));
            //modified print method
            store.print(email+" "+password+" "+username+" "+gender+" "+id+" "+x+" "+y+"\n");
            store.close();
        }catch(IOException e){
            System.out.println("Sorry, database does not exist");
        }
    }

    public T getEmail() {
        return email;
    }

    public void setEmail(T email) {
        this.email = email;
    }

    public T getUsername() {
        return username;
    }

    public void setUsername(T username) {
        this.username = username;
    }

    public T getPassword() {
        return password;
    }

    public void setPassword(T password) {
        this.password = password;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public K getGender() {
        return gender;
    }

    public void setGender(K gender) {
        this.gender = gender;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }
}
