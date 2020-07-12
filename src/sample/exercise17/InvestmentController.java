package sample.exercise17;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class InvestmentController {
    @FXML
    private TextField investment, numberOfYears, annualInterestRate, futureValue;

    @FXML
    private void calculate() {
        double investmentAmount = Double.parseDouble(investment.getText());
        double monthlyInterestRate = Double.parseDouble(annualInterestRate.getText()) / 1200;
        double years = Double.parseDouble(numberOfYears.getText());

        double fValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);

        futureValue.setText(String.format("$%.2f", fValue));
    }


    @FXML
    private void closeAPP(){
        // get a handle to the stage
        Stage stage = (Stage) futureValue.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
}
