package teema2;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Joonista laevade pommitamine kasutades JavaFXi.
 */
public class Peamurdja1_laevad_fx extends Application{

    Stage lava;
    GridPane laud = new GridPane();
    int laevaServaPikkus = 75;
    int laevadeArv = 3;
    int lauaPikkus = 4;
    Image laevaPilt = new Image("teema2/pirate.png");
    ImagePattern laevaMuster = new ImagePattern(laevaPilt);
    @Override
    public void start(Stage primaryStage) throws Exception {
        lava=primaryStage;
        seadistaLava();
        genereeriGrid();
        reageeriKlikile();
        //kasOnLaevasidAlles();
        //gameover();

    }

    private void reageeriKlikile() {

        laud.setOnMouseClicked(event -> {

            Rectangle ruut = (Rectangle) event.getTarget();
            String ruuduID = ruut.getId();

            System.out.println(ruuduID);

            if (ruuduID.equals("meri")) {
                ruut.setFill(Color.DARKBLUE);
            }
            if (ruuduID.equals("laev")) {
                //ruut.setFill(Color.BLACK);
                ruut.setFill(laevaMuster);
                ruut.setId("pohjas");
                laevadeArv--;
            }
            if (ruuduID.equals("pohjas")){

            }

            if(laevadeArv == 0){
                //gameover();
                Pane gameOverPane = new Pane();
                Scene gameOverScene = new Scene(gameOverPane);


                Label gameOverMessage = new Label("game over");
                gameOverPane.getChildren().addAll(gameOverMessage);


                lava.setScene(gameOverScene);

                lava.show();

                lava.setOnCloseRequest(event1 -> {System.exit(0);});
                System.out.println("game over");
            }

        });
    }

    private void genereeriGrid() {

        laevadeArv = 0;
        for (int i = 0; i < lauaPikkus; i++) {
            for (int j = 0; j < lauaPikkus; j++) {
                Rectangle ruut = new Rectangle(laevaServaPikkus, laevaServaPikkus);
                int rand = (int) (Math.random() * 2);

                if (rand == 1)
                    ruut.setId("meri");
                else {
                    laevadeArv++;
                    ruut.setId("laev");
                }

                ruut.setFill(Color.BLUE);
                ruut.setStroke(Color.BLACK);
                laud.add(ruut, i, j);

                /*ruut.setOnMouseClicked(event -> {

                    if (ruut.getId().equals("meri")) {
                        ruut.setFill(Color.RED);
                    }
                });*/

            }
        }

    }

    private void seadistaLava() {

        Scene manguStseen = new Scene(laud);

        lava.setScene(manguStseen);

        lava.show();

        lava.setOnCloseRequest(event -> {System.exit(0);});
    }
}
