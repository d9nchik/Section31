package sample.exercise1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
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
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setAlignment(Pos.CENTER);
        final Scene scene = new Scene(pane);
        scene.getStylesheets().add("sample/exercise1/circles.css");

        Circle first = new Circle(50);
        Circle second = new Circle(50);
        Circle third = new Circle(50);
        Circle fourth = new Circle(50);
        Pane p1 = new StackPane(first);
        Pane p2 = new StackPane(fourth);

        first.getStyleClass().addAll("whiteCircle", "blackRectangle");
        second.getStyleClass().add("whiteCircle");
        third.setId("redCircle");
        fourth.setId("blackCircle");
        fourth.getStyleClass().add("blackRectangle");
        p1.getStyleClass().add("blackRectangle");
        p2.getStyleClass().add("blackRectangle");

        pane.getChildren().addAll(p1, second, third, p2);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 1");
        primaryStage.show();
    }
}
