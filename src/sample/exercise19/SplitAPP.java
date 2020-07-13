package sample.exercise19;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SplitAPP extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("split.fxml"));
        primaryStage.setScene(new Scene(pane));
        primaryStage.setTitle("Exercise 19");
        primaryStage.show();
    }
}
