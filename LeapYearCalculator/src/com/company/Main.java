package com.company;

public class Main {

public static void  isLeapYear(int year){
    if(year >=1 && year<=9999){
        if(year % 100 !=0 && year % 4==0){
            System.out.println("year is leapyear");
        }else if(year%100==0 && year % 400==0){
            System.out.println("year is leapyear");
        }else{
            System.out.println(" year is not leapyear");
        }
    }

}

    public static void main(String[] args) {
	isLeapYear(2004);
    }
}
