package teema1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * NB! Lahenda käesolev ülesanne konsoolis. Pole vaja JavaFXi siia segada.
 *
 * 1. Kirjuta lihtne laevade pommitamise mäng, kus arvuti genereerib 1x1
 *    laevad mööda 1 dimensioonilist lauda. See tähendab, et mängulaud
 *    ei ole mitte ruudustik, vaid üks rida.
 *
 * 2. Täienda mängu nii, et nüüd oleks laual ruudustik.
 *
 * 3. Kas oskad ka nii, et laevad ei ole 1x1 vaid 1x2 ja 1x3 ja orienteeruvad
 *    nii vertikaalselt kui ka horisontaalselt?
 */
public class Peamurdja3_laevad {

    static int[][] board;
    static int[][] guesses;
    static int height = 4;
    static int width = 4;
    static boolean gameOver = false;
    static int strikeX;
    static int strikeY;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        board = initiateBoard(board);
        guesses = initiateBoard(guesses);

        fillBoard(board);

        while(!gameOver){

            pritnBoard(board);

            System.out.println();

            System.out.println("Sisesta x ja y koordinaadid (tühik vahele): ");

            String userInput = sc.nextLine();

            String[] xy = userInput.split(" ");

            System.out.println(xy[0]);

            strikeX = Integer.parseInt(xy[0]);
            strikeY = Integer.parseInt(xy[1]);

            evaluateStrike(strikeX, strikeY);



            pritnBoard(guesses);

            gameOver = true;
        }

    }

    public static int[][] initiateBoard(int[][] board){
        board = new int[height][width];
        return board;
    }

    public static int[][] fillBoard(int[][] inputBoard){
        System.out.println("test");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                inputBoard[i][j] = (int) (Math.random() * 0.7);
            }
        }
        return inputBoard;
    }

    public static void pritnBoard(int[][] board) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void evaluateStrike(int x, int y) {

        if (board[y-1][x-1] == 0){
            guesses[y-1][x-1] = 8;
        }
    }

}
