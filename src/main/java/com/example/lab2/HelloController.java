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

// Text Fields values returned
        }
    }

    }