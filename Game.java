public class Game {

    //Attributes
    private Secret secret;
    private Player player1;
    private Player player2;
    private int currentTurn;

    public Game() {
        secret =  new Secret();
        player1 = new Player("Alice");
        player2 = new Player("Bob");
    }

    public String play(String letter){
        for (int i = 0; i < secret.getFullWord().length(); i++){}

        return "";
    }
    //Constructor

    //Accessors
    
    //Mutators
    
}
  