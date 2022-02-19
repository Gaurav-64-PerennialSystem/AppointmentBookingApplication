package com.company;

import java.sql.SQLOutput;

public class Main {
    public static double Area(double radius){
        if (radius< 0){
            return -1;
        }
        double areaOfCircle=3.14 * radius *radius ;
        return areaOfCircle;
    }
 public static double Area(double x,double y){
        if((x< 0) ||(y < 0)){
            return -1;
        }
        double areaOfRectangle=x*y;
        return areaOfRectangle;
 }

    public static void main(String[] args) {
        System.out.println(Area(8));
        System.out.println(Area(8,9));
    }
}
