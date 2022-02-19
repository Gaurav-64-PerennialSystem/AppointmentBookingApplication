package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of month:");
        String month=sc.nextLine();
        switch(month){
            case "january":
                System.out.println("1st month");
                break;
            case "Feburary":
                System.out.println("2nd month");
                break;
            case "March":
                System.out.println("3rd month");
                break;
            case "April":
                System.out.println("4th month");
                break;
            case "May":
                System.out.println("5th month");
                break;

            case "june":
                System.out.println("6th month");
                break;

            case "july":
                System.out.println("7th month");
                break;

            case "August":
                System.out.println("8th month");
                break;
            case "september":
                System.out.println("9th month");
                break;

            case "October":
                System.out.println("10th month");
                break;

            case "November":
                System.out.println("11th month");
                break;
            case "December":
                System.out.println("12th month");
                break;
            default:
                System.out.println(" no month");
            break;


        }

    }
}
