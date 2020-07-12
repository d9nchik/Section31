package sample.exercise14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StopSign extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        final long RADIUS = 70;
        StackPane pane = new StackPane();

        Polygon polygon = new Polygon();
        for (int i = 0; i < 8; i++) {
            polygon.getPoints().add(RADIUS * (Math.cos(Math.PI * (1 / 8.0 + i / 4.0))));
            polygon.getPoints().add(RADIUS * (Math.sin(Math.PI * (1 / 8.0 + i / 4.0))));
        }
        pane.getChildren().add(polygon);

        pane.getChildren().add(new Text("STOP"));

        Scene scene = new Scene(pane, 200, 200);
        scene.getStylesheets().add("/sample/exercise14/sign.css");
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 14");
        primaryStage.show();


        scene.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP:
                    pane.setScaleX(pane.getScaleX() + 0.1);
                    pane.setScaleY(pane.getScaleY() + 0.1);
                    break;
                case DOWN:
                    final double scaleX = pane.getScaleX();
                    if (scaleX<=0)
                        break;
                    pane.setScaleX(scaleX - 0.1);
                    pane.setScaleY(pane.getScaleY() - 0.1);
                    break;
                case RIGHT:
                    pane.setRotate(pane.getRotate() + 1);
                    break;
                case LEFT:
                    pane.setRotate(pane.getRotate() - 1);
                    break;
            }
        });
    }
}
