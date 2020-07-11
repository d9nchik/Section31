package sample.exercise5;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;


public class RotateController {
    @FXML
    private TextField angle;

    @FXML
    private Ellipse cylinder;

    @FXML
    private void rotateCylinder(){
        cylinder.setRotate(Double.parseDouble(angle.getText()));
    }
}
