package com.company;

public class Main {
    public static void areEqualsByThreeDecimalPlaces(double first ,double second){
        double newf=first *1000d;
        double newS=second * 1000d;
        if((int)newf==(int)newS){
            System.out.println("yes True");}
        System.out.println("false");

    }
    public static void main(String[] args) {
      areEqualsByThreeDecimalPlaces(34,34);
    }
}
