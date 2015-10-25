package teema1;

/**
 * Kasutades tsükleid, lahendada järgmised ülesanded:
 * 1. Trükkida ekraanile numbrid 10 kuni 1
 * 2. Trükkida ekraanile paaritud arvud vahemikus 0 kuni 10
 * 3. Trükkida ekraanile selline tabel:
 *    0 1 2 3 4 5 6 7 8 9
 *    1 2 3 4 5 6 7 8 9 0
 *    2 3 4 5 6 7 8 9 0 1
 *    3 4 5 6 7 8 9 0 1 2
 *    4 5 6 7 8 9 0 1 2 3
 *    5 6 7 8 9 0 1 2 3 4
 *    6 7 8 9 0 1 2 3 4 5
 *    7 8 9 0 1 2 3 4 5 6
 *    8 9 0 1 2 3 4 5 6 7
 *    9 0 1 2 3 4 5 6 7 8
 */
public class Harjutus1_tsyklid {
    public static void main(String[] args) {
        for (int i = 10; i > 0 ; i--) {
            System.out.println(i);
            }
        System.out.println();
        for (int i = 1; i < 11 ; i= i + 2) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.print((i + j) % 10 + " ");
            }
            System.out.println();
        }

    }
}
