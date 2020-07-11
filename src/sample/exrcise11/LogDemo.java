package sample.exrcise11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LogDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Polyline polyline = new Polyline();
        for (double angle = 0.01; angle <= 360; angle+=0.01) {
            polyline.getPoints().addAll(
                    angle, -Math.log(angle));
        }
        polyline.setTranslateY(120);
        polyline.setTranslateX(20);
        polyline.setScaleY(20);
        polyline.setStrokeWidth(1.0 / 15);
        // Draw x-axis
        Line line1 = new Line(10, 100, 420, 100);
        Line line2 = new Line(420, 100, 400, 90);
        Line line3 = new Line(420, 100, 400, 110);
        // Draw y-axis
        Line line4 = new Line(20, 10, 20, 200);
        Line line5 = new Line(20, 10, 10, 30);
        Line line6 = new Line(20, 10, 30, 30);
        // Draw x, y axis labels
        Text text1 = new Text(380, 70, "X");
        Text text2 = new Text(40, 20, "Y");
        // Add nodes to a pane
        Pane pane = new Pane();
        pane.getChildren().addAll(polyline, line1, line2, line3, line4,
                line5, line6, text1, text2);

        Scene scene = new Scene(pane, 450, 200);
        primaryStage.setTitle("LogDemo"); // Set the window title
        primaryStage.setScene(scene); // Place the scene in the window
        primaryStage.show(); // Display the window
    }
}
