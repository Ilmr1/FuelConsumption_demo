package org.example.fuelconsumption_demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import java.util.Locale;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    private TextField distanceField;

    @FXML
    private TextField fuelField;

    @FXML
    private Label resultLabel;

    @FXML
    private Label errorLabel;

    @FXML
    private Label distanceLabel;

    @FXML
    private Label fuelLabel;

    @FXML
    private Button calculateButton;

    @FXML
    private Button switchToEnglishButton;

    @FXML
    private Button switchToFrenchButton;

    @FXML
    private Button switchToJapaneseButton;

    @FXML
    private Button switchToPersianButton;

    private ResourceBundle bundle;

    @FXML
    public void initialize() {
        switchToEnglish();
    }

    @FXML
    private void calculate() {
        try {
            double distance = Double.parseDouble(distanceField.getText());
            double fuel = Double.parseDouble(fuelField.getText());
            double consumption = (fuel / distance) * 100;
            double price = consumption * 1.67;
            resultLabel.setText(String.format(bundle.getString("result.label"), consumption, price));
            errorLabel.setVisible(false);
        } catch (NumberFormatException e) {
            errorLabel.setVisible(true);
        }
    }

    @FXML
    private void switchToEnglish() {
        switchLanguage("en", "US");
    }

    @FXML
    private void switchToFrench() {
        switchLanguage("fr", "FR");
    }

    @FXML
    private void switchToJapanese() {
        switchLanguage("ja", "JP");
    }

    @FXML
    private void switchToPersian() {
        switchLanguage("fa", "IR");
    }

    private void switchLanguage(String lang, String country) {
        Locale locale = new Locale(lang, country);
        bundle = ResourceBundle.getBundle("messages", locale);
        distanceLabel.setText(bundle.getString("distance.label"));
        fuelLabel.setText(bundle.getString("fuel.label"));
        calculateButton.setText(bundle.getString("calculate.button"));
        resultLabel.setText(bundle.getString("result.label"));
        errorLabel.setText(bundle.getString("invalid.input"));
    }
}