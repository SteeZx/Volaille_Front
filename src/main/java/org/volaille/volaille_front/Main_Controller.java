package org.volaille.volaille_front;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.volaille.volaille_back.Canard;
import org.volaille.volaille_back.Elevage;
import org.volaille.volaille_back.Poulet;
import org.volaille.volaille_back.Volaille;

import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;

public class Main_Controller implements Initializable {

    @FXML
    ChoiceBox<String> choiceBox;

    @FXML
    Label prix_poulet;
    @FXML
    Label prix_canard;
    @FXML
    Label abattage_poulet;
    @FXML
    Label abattage_canard;
    @FXML
    TextField set_poid_volaille;
    @FXML
    TextField set_nombre_volaille;


    Elevage elevage;
    ArrayList<Volaille> arr_tampon = new ArrayList<>();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceBox.getItems().addAll("Poulet", "Canard");
        prix_poulet.setText(Poulet.getPrix_poulet().toString() + "€/kg");
        prix_canard.setText(Canard.getPrix_canard().toString() + "€/kg");
        abattage_poulet.setText(Poulet.getPoids_abattage() +"kg");
        abattage_canard.setText(Canard.getPoids_abattage()+"kg");
        elevage = new Elevage();
    }

    public void addVolaille(){
        int nb_volaille = Integer.parseInt(set_nombre_volaille.getText());
        if (Objects.equals(choiceBox.getValue(), "Poulet")) {
            for (int i = 0; i < nb_volaille; i++) {
                arr_tampon.add(new Poulet(Double.parseDouble(set_poid_volaille.getText())));
            }
        } else {
            for (int i = 0; i < nb_volaille; i++) {
                arr_tampon.add(new Canard(Double.parseDouble(set_poid_volaille.getText())));
            }
        }
        elevage.ajouterVolaille(arr_tampon);
        System.out.println(elevage);
    }
}