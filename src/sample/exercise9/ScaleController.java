package sample.exercise9;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.shape.Ellipse;


public class ScaleController {
    @FXML
    private TextField x, y;

    @FXML
    private Ellipse cylinder;

    @FXML
    private void scaleCylinder(){
        cylinder.setScaleX(Double.parseDouble(x.getText()));
        cylinder.setScaleY(Double.parseDouble(y.getText()));
    }
}
