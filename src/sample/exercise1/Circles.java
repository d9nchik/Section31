package sample.exercise1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Circles extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        HBox pane = new HBox();
        pane.setSpacing(10);
        pane.setAlignment(Pos.CENTER);
        final Scene scene = new Scene(pane);
        scene.getStylesheets().add("sample/exercise1/circles.css");

        Circle first = new Circle(50);
        Circle second = new Circle(50);
        Circle third = new Circle(50);
        Circle fourth = new Circle(50);

        first.getStyleClass().addAll("whiteCircle", "blackRectangle");
        second.getStyleClass().add("whiteCircle");
        third.setId("redCircle");
        fourth.setId("blackCircle");
        fourth.getStyleClass().add("blackRectangle");

        pane.getChildren().addAll(first, second, third, fourth);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 1");
        primaryStage.show();
    }
}
