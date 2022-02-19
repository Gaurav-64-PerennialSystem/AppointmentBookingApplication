package com.company;

public class Main {
    public  static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else{
            long year=minutes/525600;
            long day=minutes/1440;
            long remainingminutes = day % 525600;
            System.out.println(year+" year "+day+" day "+remainingminutes+" minutes");
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(9000000);

            }
}
