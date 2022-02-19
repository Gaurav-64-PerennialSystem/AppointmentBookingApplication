package com.company;

public class Main {

         public static int sumFirstandLastDigit(int number){
             int lastDigit, firstDigit, divisor;;
             int totalDigits = 0;
             int sum = 0;
             lastDigit = number%10;
             totalDigits = findDigits(number);
             divisor = (int)Math.pow(10, totalDigits-1);
             firstDigit = number / divisor;
             sum = firstDigit + lastDigit;


             return sum;
         }


    private static int findDigits(int number) {
        int count = 0;
        while(number!=0) {
            count++;
            number = number/10;
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(sumFirstandLastDigit(123456789));
    }
}
