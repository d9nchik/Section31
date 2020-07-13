package sample.exercise21;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MenuDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private final TextField tfNumber1 = new TextField();
    private final TextField tfNumber2 = new TextField();
    private final TextField tfResult = new TextField();
    private final TabPane tabPane = new TabPane();

    @Override
    public void start(Stage primaryStage) {
        HBox hBox1 = new HBox(5);
        tfNumber1.setPrefColumnCount(2);
        tfNumber2.setPrefColumnCount(2);
        tfResult.setPrefColumnCount(2);
        hBox1.getChildren().addAll(new Label("Number 1:"), tfNumber1,
                new Label("Number 2:"), tfNumber2, new Label("Result:"),
                tfResult);
        hBox1.setAlignment(Pos.CENTER);

        HBox hBox2 = new HBox(5);
        Button btAdd = new Button("Add");
        Button btSubtract = new Button("Subtract");
        Button btMultiply = new Button("Multiply");
        Button btDivide = new Button("Divide");
        hBox2.getChildren().addAll(btAdd, btSubtract, btMultiply, btDivide);
        hBox2.setAlignment(Pos.CENTER);

        BorderPane pane = new BorderPane();
        pane.setCenter(hBox1);
        pane.setBottom(hBox2);


        pane.setTop(tabPane);
        tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);
        Tab tabInteger = new Tab("Integer Operation");
        Tab tabRational = new Tab("Rational Operation");
        tabInteger.setContent(new StackPane(new Text("Integer Calculation")));
        tabRational.setContent(new StackPane(new Text("Rational Calculation")));
        tabPane.getTabs().addAll(tabInteger, tabRational);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("MenuDemo"); // Set the window title
        primaryStage.setScene(scene); // Place the scene in the window
        primaryStage.show(); // Display the window

        // Handle button actions
        btAdd.setOnAction(e -> perform('+'));
        btSubtract.setOnAction(e -> perform('-'));
        btMultiply.setOnAction(e -> perform('*'));
        btDivide.setOnAction(e -> perform('/'));
    }

    private void perform(char operator) {
        double number1 = Double.parseDouble(tfNumber1.getText());
        double number2 = Double.parseDouble(tfNumber2.getText());

        double result = 0;
        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
        }

        tfResult.setText("" + (0 == tabPane.getSelectionModel().getSelectedIndex() ? (int) result : result));
    }
}
