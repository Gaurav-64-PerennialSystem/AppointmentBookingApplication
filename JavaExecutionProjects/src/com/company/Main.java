package com.company;
import com.company.EvenDigitSum;

import static com.company.GreatestCommonDivisor.getGreatestCommonDivisor;
import static com.company.LastDigitChecker.hasSameLastDigit;

public class Main {

    public static void main(String[] args) {
	EvenDigitSum evenDigitSum=new EvenDigitSum();
    evenDigitSum.getEvenDigitSum(8);
    SharedDigits sharedDigits=new SharedDigits();
        System.out.println(sharedDigits.shareDigit(5,6));

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(231, 372, 423));
        System.out.println(getGreatestCommonDivisor(34, 32));
    }
}
