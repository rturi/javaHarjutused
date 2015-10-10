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

        for (int i = 0; i < 10; i++) {


            tsykkel1(foorVASAK);
            tsykkel1(foorParem);
            tsykkel2(foorYlemine);
            tsykkel2(foorAlumine);

            tsykkel2(foorVASAK);
            tsykkel2(foorParem);
            tsykkel1(foorYlemine);
            tsykkel1(foorAlumine);
        }

    }
    public void tsykkel1(Foor foor) {
        foor.vahetaPunast();
        foor.paus(3);
        foor.vahetaKollast();
        foor.paus(0.5);
        foor.vahetaPunast();
        foor.vahetaKollast();
    }
    public void tsykkel2(Foor foor) {
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
