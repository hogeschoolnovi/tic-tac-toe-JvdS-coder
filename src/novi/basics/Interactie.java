package novi.basics;

import java.util.Scanner;

public class Interactie<player1Name> {

    // scanner aanmaken
    Scanner playerInput = new Scanner(System.in);

    // attributen:
    public String vraagSpeler1 = " ";
    public String vraagSpeler2 = " ";
    public String vraagSpeler = " ";
    public int maxAantalRondes;
    private boolean gelijkSpel;
    private int score;
    int doSet;
    int maxRounds = 0;
    private String playerName;

    // methoden: interacties die de speler uit kan voeren
    // constructor
    public Interactie() {
        this.vraagSpeler1 = vraagSpeler1;
        this.vraagSpeler2 = vraagSpeler2;
        this.maxAantalRondes = maxRounds;
        this.score = score;
    }

    public String getNames() {
        // get methoden
        // de 1e speler om zijn naam vragen
        System.out.print("Player 1, what is your name ? : ");

        // de naam van de 1e speler opslaan
        String player1Name = playerInput.next();
        Player vraagSpeler1 = new Player(player1Name,'X');

        // get methoden
        // de 2e speler om zijn naam vragen
        System.out.print("Player 2, what is your name ? : ");

        // de naam van de 2e speler opslaan
        String player2Name = playerInput.next();
        Player vraagSpeler2 = new Player(player2Name,'0');
        return player1Name;
    }

    public int getNumGames(int maxAantalSpelen) {
        // get methoden
        // vragen hoeveel keer spelen
        System.out.print("How many rounds would you play ? : ");
        maxRounds = playerInput.nextInt();
        return maxRounds;
    }

    public String getPlayerMove(String playerName, int maxAantalSpel) {
        this.playerName = playerName;
        // get methoden
        // vraag speler om zet
        String vraagSpeler = playerName;
        System.out.print(vraagSpeler + ", Your Choice ? : ");
        doSet = playerInput.nextInt();
        //PlayerMove.getPlayerSet(vraagSpeler, doSet);
        return vraagSpeler;
    }

    public void getGelijkSpel() {
        // bepaal gelijkspel
        if (player1(score) == player2(score)) {
            System.out.println("Het is gelijk spel !");
            gelijkSpel = true;
        }

    }

    private boolean player1(int score) {
        return player1(score);
    }
    private boolean player2(int score) {
        return player2(score);
    }
}


