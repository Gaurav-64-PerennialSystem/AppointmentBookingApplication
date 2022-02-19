package com.company;

public class Main {
       public static void printNumberInWord(int number){
            if(number==0){
                System.out.println("ZERO");
            }else if(number ==1 || number==-1){
                System.out.println("One");
            }else if(number ==2|| number ==-2){
                System.out.println("two");
            }else if(number ==3|| number ==-3){
                System.out.println("three");
            }else if(number ==4|| number ==-4){
                System.out.println("four");
            }else if(number ==5|| number ==-5){
                System.out.println("five");
            }else if(number ==6|| number ==-6){
                System.out.println("six");
            }else if(number ==7|| number ==-7){
                System.out.println("Seven");
            }else if(number ==8|| number ==-8){
                System.out.println("eight");
            }else if(number ==9|| number ==-9){
                System.out.println("nine");
            }else {
                System.out.println("other");
            }
       }
    public static void main(String[] args) {
	printNumberInWord(8);
    }
}
