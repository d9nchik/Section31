package sample.exercise12;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class QuadraricDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Polyline polyline = new Polyline();
        for (double x = -180; x <= 180; x++) {
            polyline.getPoints().addAll(
                    x, -(x*x)/10_000);
        }
        polyline.setTranslateY(20);
        polyline.setTranslateX(200);
        polyline.setScaleX(0.5);
        polyline.setScaleY(50);
        polyline.setStrokeWidth(1.0 / 25);
        // Draw x-axis
        Line line1 = new Line(10, 100, 420, 100);
        Line line2 = new Line(420, 100, 400, 90);
        Line line3 = new Line(420, 100, 400, 110);
        // Draw y-axis
        Line line4 = new Line(200, 10, 200, 200);
        Line line5 = new Line(200, 10, 190, 30);
        Line line6 = new Line(200, 10, 210, 30);
        // Draw x, y axis labels
        Text text1 = new Text(380, 70, "X");
        Text text2 = new Text(220, 20, "Y");
        // Add nodes to a pane
        Pane pane = new Pane();
        pane.getChildren().addAll(polyline, line1, line2, line3, line4,
                line5, line6, text1, text2);

        Scene scene = new Scene(pane, 450, 200);
        primaryStage.setTitle("QuadraticDemo"); // Set the window title
        primaryStage.setScene(scene); // Place the scene in the window
        primaryStage.show(); // Display the window
    }
}
