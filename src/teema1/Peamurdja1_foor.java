package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Kasuta objekti Foor, et teha valgusfoori tsükkel 5 korda.
 * Foori kasutusjuhend: https://github.com/KristerV/javaHarjutused
 *
 * Abiks on "Naidis_KollaneVilkuja" klass, kus on juba kollane tuli vilkuma pandud.
 * Lisaks tuleb teada, et Foor on JavaFX programm. Tavalise programmiga
 * on kaks erinevust: klass peab laiendama (extends) teist klassi nimega
 * Application ja programm mitte ei alga main() meetodi seest, vaid
 * hoopis start() meetodi seest. Vaata Naidis_KollaneVilkuja näidet. Muide,
 * kui "extends Application" õigesse kohta ära kirjutad siis Intellij
 * pakub sulle, et kirjutab ise start() meetodi õigesti ära - proovi järgi.
 *
 * NB! Kui kirjutad new Foor(); siis IDE pakub sulle Foori importimise võimalust.
 * Kliki punase teksti peale ja vajuta alt+enter.
 */
public class Peamurdja1_foor extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
    Foor foor = new Foor();
        foor.vahetaPunast();
        foor.paus(3);
        foor.vahetaKollast();
        foor.paus(0.5);
        foor.vahetaPunast();
        foor.vahetaKollast();
        foor.vahetaRohelist();
        foor.paus(3);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaKollast();
        foor.paus(1);
        foor.vahetaKollast();
        foor.vahetaPunast();
        foor.paus(3);
        foor.vahetaKollast();
        foor.paus(0.5);
        foor.vahetaPunast();
        foor.vahetaKollast();
        foor.vahetaRohelist();
        foor.paus(3);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaKollast();
        foor.paus(1);
        foor.vahetaKollast();
        foor.vahetaPunast();
        foor.paus(3);
        foor.vahetaKollast();
        foor.paus(0.5);
        foor.vahetaPunast();
        foor.vahetaKollast();
        foor.vahetaRohelist();
        foor.paus(3);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaKollast();
        foor.paus(1);
        foor.vahetaKollast();
    }
}

/*
## Foor

Laiendades `Application` klassi ja luues `Foor` objekti saad omale tühja valgusfoori:

```
public class Ristmik extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Foor foor = new Foor();
    }
}
```

![Foor1](/readme/Foor.png?raw=true)

Programmeerida saab järgmiste vahenditega:
```
foor.vahetaPunast();   // pane punane   tuli põlema, või kui juba põleb kustuta ära.
foor.vahetaKollast();  // pane kollane  tuli põlema, või kui juba põleb kustuta ära.
foor.vahetaRohelist(); // pane roheline tuli põlema, või kui juba põleb kustuta ära.
foor.paus(sek);  // jäta mis iganes värv praegu ees on põlema 'sek' sekundiks.
```

Näiteks paneb järgnev kood rohelise tule põlema ja kustutab viie sekundi pärast ära ka.
```
foor.vahetaRohelist();
foor.paus(5);
foor.vahetaRohelist();
```

Foori luues saab talle anda kaasa kaks parameetrit:
```
new Foor(suund, primaryStage);
```

**suund** on üks neljast: Foor.YLEMINE
                          Foor.ALUMINE
                          Foor.VASAK
                          Foor.PAREM
**primaryStage** on see samune, mis start() meetodiga kaasa tuleb. Selle lisamine teiseks parameetriks on vajalik selleks, et kõik foorid ühte aknasse tuua.

Näide, kuidas kaks foori ühe ja sama akna sisse saab:
```
new Foor(Foor.YLEMINE, primaryStage);
new Foor(Foor.ALUMINE, primaryStage);
```
 */