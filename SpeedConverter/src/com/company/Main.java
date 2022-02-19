package com.company;

public class Main {
     public static long toMilesPerHour(double kilometersPerHour){
         if(kilometersPerHour < 0){
             return -1;
         }
         return Math.round(kilometersPerHour/1.609);

     }
       public static void printConversion(double kiloMeterPerHour){
         if(kiloMeterPerHour<0){
             System.out.println("Invalid Value");
         }else{
             long milesPerHour=toMilesPerHour(kiloMeterPerHour);
             System.out.println(kiloMeterPerHour+" km/h= " +milesPerHour+" mi/h ");
         }
       }
    public static void main(String[] args) {
           double miles=toMilesPerHour(2.5);
        System.out.println("Miles:"+miles);
        printConversion(10.5);

     }
}
