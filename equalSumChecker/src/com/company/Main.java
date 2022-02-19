package com.company;

public class Main {

    public static void hasEqualSum(int num1,int num2,int num3){
        if(num1+num2==num3){
            System.out.println("true");

        }
        else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        hasEqualSum(1,1,2);
    }
}
