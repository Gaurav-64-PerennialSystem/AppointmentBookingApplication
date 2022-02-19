package com.company;

public class Main {

    public static double calculateInterest(double amount ,double InterestRate) {

    return (amount *(InterestRate/100));

    }
    public static void main(String[] args) {

    for(double i=2;i<9;i++){
        System.out.println(" 10000 at the 2% interest rate:: "+calculateInterest(10000,i)+"  i= "+i);
    }
    }
}
