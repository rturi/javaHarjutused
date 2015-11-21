package PommintamineOOP;

import java.util.Scanner;

/**
 * Created by Roland on 21/11/2015.
 */
public class Mangija {

    private Scanner sc = new Scanner(System.in);


    public int[] kuhuLasta() {

        int[] koordinaadid = new int[2];

        System.out.println("sisesta koordinaadid kohal xxx-yyy");

        String[] input = sc.nextLine().split("-");

        koordinaadid[0] = Integer.parseInt(input[0]);
        koordinaadid[1] = Integer.parseInt(input[1]);

        return koordinaadid;
    }

    public void pihtas() {
        System.out.println("laks pihta");
    }

    public void moodas() {
        System.out.println("laks mooda");
    }

    public void gameOver() {

    }
}

