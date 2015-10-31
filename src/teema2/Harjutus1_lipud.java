package teema2;

import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

/**
 * 1. Joonista eesti lipp kasutades kolme Rectangle
 * 2. Joonista Jaapani lipp kasutades Rectangle ja Circle
 */
public class Harjutus1_lipud extends Application{

    @Override


    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        Scene stseen = new Scene(pane, 500, 500);
        primaryStage.setScene(stseen);

        Rectangle sininekast = new Rectangle(100, 100, 300, 300);
        sininekast.setFill(Color.BLUE);

        Rectangle mustkast = new Rectangle(100, 175, 300, 300);
        mustkast.setFill(Color.BLACK);

        Rectangle valgekast = new Rectangle(100, 250, 300, 300);
        valgekast.setFill(Color.WHITE);


        Circle punanering = new Circle(250,400,50);
        punanering.setFill(Color.RED);


        pane.getChildren().add(sininekast);
        pane.getChildren().add(mustkast);
        pane.getChildren().add(valgekast);
        pane.getChildren().add(punanering);


        primaryStage.show();

    }

}
