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
public class User {
    private String name,gender;
    private double coor_x,coor_y;

    public User(String name, String gender,double coor_x, double coor_y) {
        this.name = name;
        this.gender = gender;
        this.coor_x = coor_x;
        this.coor_y = coor_y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getCoor_x() {
        return coor_x;
    }

    public void setCoor_x(double coor_x) {
        this.coor_x = coor_x;
    }

    public double getCoor_y() {
        return coor_y;
    }

    public void setCoor_y(double coor_y) {
        this.coor_y = coor_y;
    }

    @Override
    public String toString() {
        return name + "," + gender + "," + coor_x + "," + coor_y;
    }

}
