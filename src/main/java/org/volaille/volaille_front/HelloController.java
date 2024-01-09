package org.volaille.volaille_front;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    ChoiceBox<String> volailletype;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    void initialize() {
        volailletype.getItems().add("Poulet");
        volailletype.getItems().add("Canard");
    }
}