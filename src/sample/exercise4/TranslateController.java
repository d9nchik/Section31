package sample.exercise4;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;


public class TranslateController {
    @FXML
    private TextField x, y;

    @FXML
    private Rectangle square;

    @FXML
    private void translateSquare(){
        square.setTranslateX(Double.parseDouble(x.getText()));
        square.setTranslateY(Double.parseDouble(y.getText()));
    }
}
