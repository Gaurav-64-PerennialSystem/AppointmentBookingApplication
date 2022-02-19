package com.company;

public class LastDigitChecker {
    public static boolean hasSameLastDigit (int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber >= 10 && firstNumber <= 1000) && (secondNumber >= 10 && secondNumber <= 1000) && (thirdNumber >= 10 && thirdNumber <= 1000)) {
            System.out.println("Do any of given numbers (" + firstNumber + ", " + secondNumber + ", " + thirdNumber + ") share a last digit?");
            return ((firstNumber % 10 == secondNumber % 10) || (firstNumber % 10 == thirdNumber % 10) || (secondNumber % 10 == thirdNumber % 10));
        }
        System.out.println("Invalid input");
        return false;
    }
}
