package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
       public static void checkNumber(int number){

          for (int i=0;i<number;i++){
           if(number>0){
               System.out.println("positive Number");
               break;
           }else if(number < 0){
               System.out.println("negative Number");

           }else{
               System.out.println("Zero");
               break;
           }
       }}
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number::::");
        int number=sc.nextInt();
        checkNumber(number);


    }
}
