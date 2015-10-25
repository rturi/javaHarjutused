package teema1;

import java.util.Arrays;
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

        int[] inputNumbers = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Sisesta " + (i + 1) + ". number:");
            inputNumbers[i] = sc.nextInt();
        }

        Arrays.sort(inputNumbers);

        System.out.println("sisestatud numbrid sorteerituna " + Arrays.toString(inputNumbers));

    }

}
