package com.example.lab2;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField annualInterestRate;

    @FXML
    private TextField loanAmount;

    @FXML
    private TextField numberOfYears;

    @FXML
    private TextField monthlyPayment;

    @FXML
    private TextField totalPayment;

    @FXML
    protected void calculateLoanPayment( ) {
        try {

            double interestRate = Double.parseDouble(annualInterestRate.getText()) / 100 / 12;
            int years = Integer.parseInt(numberOfYears.getText());
            double loan = Double.parseDouble(loanAmount.getText());
// Text Fields values returned

            double factor = 1;
            for (int i = 0; i < years * 12; i++) {

                factor *= (1 + interestRate);

            }
            double monthly = loan * interestRate / (1 - 1 / factor);
            // Monthly payment being calculated

            double total = monthly * years * 12;
            // Total payment

            monthlyPayment.setText(String.format("%.2f", monthly));
            totalPayment.setText(String.format("%.2f", total));

        } catch (NumberFormatException e) {
            monthlyPayment.setText("Invalid input");
            totalPayment.setText("Invalid input");
        }
    }
}