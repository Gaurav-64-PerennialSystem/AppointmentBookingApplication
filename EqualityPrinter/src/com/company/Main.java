package com.company;

public class Main {

         public static void printEqual(int x ,int y,int z){
             if(x<0){
                 System.out.println("Invalid Value");
             } else if ((x == y) && (y==z) && (x==z)){
                 System.out.println("all numbers are equal");
             }else if(x!=y && y!=z && x!=z){
                 System.out.println("All numbers are different");
             }else{
                 System.out.println("Niether all are equals and different");
             }

         }


    public static void main(String[] args) {

         printEqual(1,2,3);

         }
}
