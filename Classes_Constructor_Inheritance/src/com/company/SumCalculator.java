package com.company;

public class SumCalculator {


    double firstNumber;
    double SecondNumber;

    public SumCalculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        SecondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return SecondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        SecondNumber = secondNumber;
    }
    public double getAdditionResult(){
        return firstNumber+SecondNumber;
    }
    public double getMultiplicationResult(){
        return firstNumber*SecondNumber;
    }
    public double getSubstractionResult(){
        return firstNumber-SecondNumber;
    }
    public double getdivisionResult(){
       if(SecondNumber==0){
           return this.SecondNumber=0;
       }else{


        return firstNumber/SecondNumber;
    }}
}
