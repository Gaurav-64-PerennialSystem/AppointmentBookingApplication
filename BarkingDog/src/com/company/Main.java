package com.company;

public class Main {
     public static boolean shouldWakeUp(boolean barking,int hourOfDay){
         if(hourOfDay<0 || hourOfDay>23)
          return false;
         if(barking){
             if(hourOfDay<8 || hourOfDay>22)
             return true;
         }return false;


     }
    public static void main(String[] args) {
     shouldWakeUp(true,5);
    }
}
