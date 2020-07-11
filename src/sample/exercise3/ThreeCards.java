package sample.exercise3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;

public class ThreeCards extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        HBox pane = new HBox();
        pane.getStylesheets().add("sample/exercise3/threeCards.css");

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= 54; i++)
            arrayList.add(i);
        Collections.shuffle(arrayList);

        for (int i = 0; i < 3; i++)
            pane.getChildren().add(new ImageView("image/card/" + arrayList.get(i) + ".png"));

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise 3"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show();
    }
}
