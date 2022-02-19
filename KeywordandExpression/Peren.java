public class Peren {
    public static void main(String []args){

        boolean gameOver=true;
        int score=800;
        int levelCompleted=5;
        int bonus=100;
        calculateScore(true,800,5,100);
        if(gameOver){
            int finalScore=score+(levelCompleted*bonus);
            finalScore+=1000;
            System.out.println("your final score was "+finalScore);
        }
        score=10000;
        levelCompleted=8;
        bonus=200;
        if(gameOver){
            int finalScore=score+(levelCompleted*bonus);
            System.out.println("your final score was"+finalScore);
        }
    }
    public static void calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){
        boolean gameOver=true;
        int score=800;
        int levelCompleted=5;
        int bonus=100;
        if(gameOver){
            int finalScore=score+(levelCompleted*bonus);
            finalScore+=1000;
            System.out.println("your final score was"+finalScore);
        }
    }
}
