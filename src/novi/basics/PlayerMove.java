package novi.basics;

import java.util.Arrays;
import java.util.Scanner;

public class PlayerMove<player, playset> {

    // scanner aanmaken
    Scanner playerInput = new Scanner(System.in);

    // attributen:
    public String player1;
    public String player2;
    public String player;
    public String playset;
    private boolean gelijkSpel;
    int[] rij = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    String[] regel;
    private int score;
    String yourTurn;

    // methoden: interacties die de speler uit kan voeren
    // constructor
    public PlayerMove() {
        this.player1 = player1;
        this.player2 = player2;
        this.score = score;
    }

    /*
    public static int getPlayerSet(String playerName, int yourPlay) {

        for (int i = 0; i < 9; i++) {
            if (int rij[i] == yourPlay - 1){

            }
            return i;
        }
    }
    */

    public int getPlayerScore() {
        return score;
    }

    public boolean getGelijkSpel() { return gelijkSpel; }


}
