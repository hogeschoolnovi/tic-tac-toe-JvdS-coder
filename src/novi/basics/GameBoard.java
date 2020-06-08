package novi.basics;

import java.util.Arrays;

public class GameBoard {

    //  attributen:
    public int actueleSpeelRonde;
    public boolean showGrid = true;
    //private boolean stopSpel;

    // methoden: acties
    // constructor
    public void play(int maxAantalSpel) {
        int maxAantalSpelen;

        // bepaal grootte board
        char[] board = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        // maximale aantal rondes opslaan
        int maxRounds = board.length;

            // Toon speelbord
        public static void printBoard(char[] board) {
            for (int fieldIndex = 0; fieldIndex < board.length; fieldIndex++) {
                System.out.print(board[fieldIndex] + " ");
                // als we het tweede veld geprint hebben of het vijfde veld geprint hebben
                // dan gaan we naar de volgende regel
                if(fieldIndex == 2 || fieldIndex == 5) {
                    System.out.println();
                }
            }
            System.out.println();
        }

        /*    //showGrid = true;
            String regel;
            int[] rij = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            while (showGrid) {
                System.out.println("");
                regel = rij[0] + " " + rij[1] + " " + rij[2];
                System.out.println(Arrays.deepToString(new String[]{regel}));
                regel = rij[3] + " " + rij[4] + " " + rij[5];
                System.out.println(Arrays.deepToString(new String[]{regel}));
                regel = rij[6] + " " + rij[7] + " " + rij[8];
                System.out.println(Arrays.deepToString(new String[]{regel}));
                System.out.println("");
                System.out.println("Speelbord : TicTacToe !");
                showGrid = false;
            }
            return maxAantalSpel;
        */
    }
}

