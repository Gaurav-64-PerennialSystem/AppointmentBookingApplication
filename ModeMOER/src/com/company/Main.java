package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void displayHighScoreposition(String playerName,int highScorePosition,int playerScore){
        System.out.println(playerName+"managed to get into position "+highScorePosition+"on the high score table"+playerScore);
    }
    public static int  calculateHighScorePosition(int playerScore){
        if(playerScore >1000){
            return 1;
        }else if(playerScore >500 && playerScore <1000){
            return 2;
        }else if(playerScore >100 && playerScore < 500){
            return 3;
        }else{
            return 4;
        }

    }
    public static void main(String[] args) {

  int highestPosition=calculateHighScorePosition(1500);
        displayHighScoreposition("Gaurav",1,1500);
        calculateHighScorePosition(900);
        displayHighScoreposition("Mithilesh",2,900);
        calculateHighScorePosition(400);
        displayHighScoreposition("Gaurav",3,400);
        calculateHighScorePosition(50);
          displayHighScoreposition("Gaurav",4,50);





    }
}
