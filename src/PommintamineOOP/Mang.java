package PommintamineOOP;

/**
 * Created by Roland on 21/11/2015.
 */
public class Mang {

    public Mang(){
        Meri meri = new Meri(10);
        System.out.println("Mang () started");


        //1. Mangu seadistamine

        Mangija mangija = new Mangija();



        //2. Mangu toos hoidmine
        while (meri.laevuOnAlles()){

            meri.kuvaLaud();
            int[] lask = mangija.kuhuLasta();
            boolean pihtas = meri.saiPihta(lask);
            if(pihtas){
                mangija.pihtas();
            }
            else {
                mangija.moodas();
            }

            mangija.gameOver();
            /*
        */
        }

    }
}
