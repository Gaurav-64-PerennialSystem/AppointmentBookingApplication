package com.company;

public class EvenDigitSum {
    public static void getEvenDigitSum(int number) {
        int evenSum = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenSum = evenSum + i;

            }

        }System.out.println("even number must be"+ evenSum);
    }
}
