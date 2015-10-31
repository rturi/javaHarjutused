package teema2;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

/**
 * 1. Loo sisse logimise ekraan (ainult visuaal)
 * 2. Määra üks võimalik kasutaja ja parool (andmebaasi veel ei kasuta)
 * 3. Ebaõnnestunud katse näitab kasutajale errorit
 * 4. Õnnestunud katse puhul vaheta pilt uue vastu (kasvõi roheline ring), .
 */
public class Harjutus3_logisisse extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        String parool = "123456";
        VBox vBox = new VBox();
        Scene stseen = new Scene(vBox);
        primaryStage.setScene(stseen);
        primaryStage.show();

        Label kasutajaSilt = new Label("Kasutajanimi");
        TextField kasutajaTekst = new TextField();
        Label parooliSilt = new Label("Parool");
        PasswordField parooliSisend = new PasswordField();
        Button nupp = new Button("Sisesta");
        Label infoSilt = new Label();


        nupp.setOnAction(event -> {
            System.out.println("klik");
            String kasutajaSisu = kasutajaTekst.getText();
        });

        vBox.getChildren().addAll(kasutajaSilt, kasutajaTekst, parooliSilt, parooliSisend, nupp, infoSilt);


    }
}
