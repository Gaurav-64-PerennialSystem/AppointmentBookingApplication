package com.company;

public class Main {
    public static boolean isCatPlaying (boolean summer, int temperature){
        if((temperature > 24) && (temperature < 36)){
            System.out.println("true");
            return true;
        } else if((summer) && (temperature > 24) && (temperature < 46)){
            System.out.println("true");
            return true;
        } else
            System.out.println("false");
        return false;
    }


    public static void main(String[] args) {
	isCatPlaying(true,10);
    isCatPlaying(false,36);
    isCatPlaying(false ,28);

    }
}
