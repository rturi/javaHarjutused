package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;


/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Foor foorYlemine = new Foor(Foor.YLEMINE, primaryStage);
        Foor foorAlumine = new Foor(Foor.ALUMINE, primaryStage);
        Foor foorVASAK = new Foor(Foor.VASAK, primaryStage);
        Foor foorParem = new Foor(Foor.PAREM, primaryStage);

        foorYlemine.vahetaPunast();
        foorAlumine.vahetaPunast();
        foorVASAK.vahetaRohelist();
        foorParem.vahetaRohelist();
        foorYlemine.paus(2);
        foorAlumine.paus(2);
        foorVASAK.paus(2);
        foorParem.paus(2);
        foorVASAK.vahetaRohelist();
        foorParem.vahetaRohelist();
        foorYlemine.vahetaKollast();
        foorAlumine.vahetaKollast();
        foorVASAK.vahetaKollast();
        foorParem.vahetaKollast();
        foorYlemine.paus(0.5);
        foorAlumine.paus(0.5);
        foorVASAK.paus(0.5);
        foorParem.paus(0.5);



    }
}
