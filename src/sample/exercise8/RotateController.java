package sample.exercise8;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.shape.Ellipse;


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
