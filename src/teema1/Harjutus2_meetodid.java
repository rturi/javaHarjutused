package teema1;

import java.util.Scanner;

/**
 * 1. Kirjutada meetod, mis tagastab parameetrina etteantud arvu kuubi.
 * 2. Kirjutada meetod, mis saab parameetritena kaks arvu (vahemiku) ning
 *    tagastab kasutaja sisestatud arvu, juhul kui see on lubatud vahemikus.
 *    Senikaua, kui kasutaja sisestab midagi ebasobivat, käseb meetod kasutajal
 *    arvu uuesti sisestada.
 */
public class Harjutus2_meetodid {

    public static void main(String[] args) {

        System.out.println("number kolm kuubis on " + tostaKuupi(3));

        Scanner sc = new Scanner(System.in);

        System.out.println("Palun sisesta vahemiku algus");

        int start = Integer.valueOf(sc.nextLine());

        System.out.println("Palun sisesta vahemiku lõpp");

        int end = Integer.valueOf(sc.nextLine());

        while (true) {
            System.out.println("Sisesta vahemikku jääv number");

            String input = sc.nextLine();
            int inputToInt = Integer.valueOf(input);

            if (inputToInt == kasutajaSisestus(input, start, end)) {
                System.out.println("Sisestatud " + input + " oli ok");
                System.out.println();
            }
            else {
                System.out.println("Sellist sodi ma vastu ei võta. // lahkub solvunult");
                break;
            }
        }


    }


    public static int tostaKuupi(int arv) {

        return arv*arv*arv;

    }

    public static int kasutajaSisestus(String kysimus, int min, int max) {

        int inputToInt = Integer.valueOf(kysimus);

        if(inputToInt <= max && inputToInt >= min)  return inputToInt; else return 999999;
    }
}
