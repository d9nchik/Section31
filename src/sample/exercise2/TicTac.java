package sample.exercise2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Random;

public class TicTac extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.getStylesheets().add("sample/exercise2/ticTac.css");
        pane.setId("pane");

        Image tick = new Image("image/x.gif");
        Image tack = new Image("image/o.gif");

        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int choice = random.nextInt(4);
                switch (choice) {
                    case 0:
                        pane.add(new ImageView(tack), j, i);
                        break;
                    case 1:
                        pane.add(new ImageView(tick), j, i);
                        break;
                    default:
                        ImageView node = new ImageView();
                        node.setFitHeight(35);
                        node.setFitWidth(40);
                        pane.add(node, j, i);
                }
            }
        }

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise 2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
