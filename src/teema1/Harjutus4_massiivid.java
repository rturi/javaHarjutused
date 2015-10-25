package teema1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 1. Salvesta kasutajalt 10 numbrit ja sorteeri suuruse järgi. (int[])
 * 2. Salvesta kasutajalt 10 sõne ja sorteeri tähestikulises järjekorras. (String[])
 * 3. Salvesta kasutajalt x arv numbreid, lõpeta küsimine kui number on 0
 *    ja sorteeri tulemus suuruse järgi. (ArrayList)
 *
 * main() meetodi saad lühendiga psvm.
 */
public class Harjutus4_massiivid {

    public static void main(String[] args) {

        /*
        //harjutus 1

        int[] inputNumbers = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Sisesta " + (i + 1) + ". number:");
            inputNumbers[i] = sc.nextInt();
        }

        Arrays.sort(inputNumbers);

        System.out.println("sisestatud numbrid sorteerituna " + Arrays.toString(inputNumbers));
        */

        /*
        //harjutus 2
        String[] inputStrings = new String[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Sisesta " + (i + 1) + ". sõne:");
            inputStrings[i] = sc.nextLine();
        }

        Arrays.sort(inputStrings);

        System.out.println("sisestatud numbrid sorteerituna " + Arrays.toString(inputStrings));
        */


        /*
        //h3 Array

        int[] inputNumbers = new int[1];
        Scanner sc = new Scanner(System.in);
        int counter = 0;


        while(true) {
            System.out.println("Sisesta " + (counter + 1) + ". number:");
            inputNumbers[counter] = sc.nextInt();
            if (inputNumbers[counter] == 0) break;
            counter++;

            inputNumbers = Arrays.copyOf(inputNumbers, inputNumbers.length + 1);

        }

        Arrays.sort(inputNumbers);

        System.out.println("sisestatud numbrid sorteerituna " + Arrays.toString(inputNumbers));
         */

        //h3 ArrayList


        ArrayList <Integer> inputNumbers = new ArrayList <Integer>();
        Scanner sc = new Scanner(System.in);
        int counter = 0;


        while(true) {
            System.out.println("Sisesta " + (counter + 1) + ". number:");
            inputNumbers.add(counter, sc.nextInt());
            if (inputNumbers.get(counter) == 0) break;
            counter++;


        }

        Collections.sort(inputNumbers);

        System.out.println("sisestatud numbrid sorteerituna " + inputNumbers);

    }
}
