package LoginDB;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Roland on 22/11/2015.
 */
public class LoginScreen {
    public LoginScreen() {
        Stage stage = new Stage();
        VBox vbox = new VBox();
        Scene scene = new Scene(vbox);

        Label kasutajaLabel = new Label("kasutajanimi:");
        TextField kasutjaInput = new TextField();
        Label parooliLabel = new Label("parool:");
        TextField parooliInput = new TextField();
        Button loginButton = new Button("login");
        Button registerButton = new Button("register");


        vbox.getChildren().addAll(kasutajaLabel, kasutjaInput, parooliLabel, parooliInput, loginButton, registerButton);

        stage.setScene(scene);

        stage.show();

        registerButton.setOnAction(event -> {

            String kasutajanimi = kasutjaInput.getText();
            String parool = parooliInput.getText();

            Andmebaas a = new Andmebaas();
            a.registreeriKasutaja(kasutajanimi, parool);
            a.kuvaRead(kasutajanimi);
            a.sulgeYhendus();

        });

    }
}
