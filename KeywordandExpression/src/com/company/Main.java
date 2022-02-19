package com.company;

public class Main {

    public static void main(String[] args) {



    int higherScorePosition = calculateHighScorePosition(1500);

    displayHighScorePosition("Gaurav",1);

    higherScorePosition=

    calculateHighScorePosition(900);

    displayHighScorePosition("mithilesh",2);

    higherScorePosition=

    calculateHighScorePosition(400);

    displayHighScorePosition("Prachi",3);

    higherScorePosition=

    calculateHighScorePosition(50);

    displayHighScorePosition("Prachi1",4);




    public static void displayHighScorePosition(String playerName,int highScorePosition){

        System.out.println(playerName+"  managed to get into position "
                + highScorePosition+" on the highscore table");
    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >1000) {
            return 1;
        }else if(playerScore >500 && playerScore < 1000){
            return 2;
        }else if(playerScore >100 && playerScore < 500){
            return 3;
        }else{
            return 4;
        }
    }
}
