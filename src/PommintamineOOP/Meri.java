package PommintamineOOP;

/**
 * Created by Roland on 21/11/2015.
 */
public class Meri {

    private int lauaServaPikkus;
    private Laev[] laevastik;

    public Meri(int pikkus){
        lauaServaPikkus = pikkus;

        tekitaLaevastik();
    }

    private void tekitaLaevastik() {

        laevastik = new Laev[5];

        for (int i = 0; i < laevastik.length; i++) {
            laevastik[i] = new Laev(i+1, lauaServaPikkus);
        }
    }

    public boolean laevuOnAlles() {

        for (int i = 0; i < laevastik.length; i++) {
            boolean elus = laevastik[i].oledElus();
            if(elus) {
                return true;
            }
        }

        return false;
    }

    public boolean saiPihta(int[] lask) {


        for (Laev laev : laevastik) {
            boolean pihtas = laev.kasTabas(lask);
            if (pihtas) {
                return true;
            }
        }

        return false;
    }

    public void kuvaLaud() {
        for (int i = 0; i < lauaServaPikkus; i++) {
            for (int j = 0; j < lauaServaPikkus; j++) {

                boolean onLaev = false;
                int[] lask = new int[2];
                lask[0] = j;
                lask[1] = i;

                for(Laev laev : laevastik) {
                    onLaev = laev.kasTabas(lask);
                    if (onLaev) break;
                }

                    if(onLaev){
                        System.out.print("O ");
                    } else
                        System.out.print("~ ");
            }
            System.out.println();
        }
    }
}
