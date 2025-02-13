import java.util.Scanner;


public class Player {
    public static Scanner inputScanner = new Scanner(System.in);
    private String name;
    private int score = 0;

    public void setName(){}
   
    public Player(String name){
        this.name = name;
        this.score = 0;
    }

    public int getScore(){
        return score;
    }

    public void addScore(int amount){
        score += amount;
    }

    public String getName(){
        return name;
    }

}
//setName
//getGuess