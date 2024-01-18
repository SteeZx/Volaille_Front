package org.volaille.volaille_front;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.util.Pair;
import org.volaille.volaille_back.Canard;
import org.volaille.volaille_back.Elevage;
import org.volaille.volaille_back.Poulet;
import org.volaille.volaille_back.Volaille;
import org.volaille.volaille_back.mail;

import java.io.IOException;
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
    @FXML
    TextField set_poid_canard;
    @FXML
    TextField set_poid_poulet;
    @FXML
    TextField set_prix_canard;
    @FXML
    TextField set_prix_poulet;
    @FXML
    Label label_canard_abattage;
    @FXML
    Label label_poulet_abattage;
    @FXML
    Label label_canard_prix_abattage;
    @FXML
    Label label_poulet_prix_abattage;
    @FXML
    Label label_canard_dessouspoid;
    @FXML
    Label label_poulet_dessouspoid;
    @FXML
    TextField MailRecipient;
    Elevage elevage;
    ArrayList<Volaille> arr_tampon = new ArrayList<>();

    /***
     * Initializes the controller class.
     * @param url
     * The location used to resolve relative paths for the root object, or
     * {@code null} if the location is not known.
     *
     * @param resourceBundle
     * The resources used to localize the root object, or {@code null} if
     * the root object was not localized.
     *
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceBox.getItems().addAll("Poulet", "Canard");
        prix_poulet.setText(Poulet.getPrix_poulet().toString() + "€/Kg");
        prix_canard.setText(Canard.getPrix_canard().toString() + "€/Kg");
        abattage_poulet.setText(Poulet.getPoids_abattage() +"Kg");
        abattage_canard.setText(Canard.getPoids_abattage()+"Kg");
        elevage = new Elevage();
        label_canard_abattage.setText("0");
        label_poulet_abattage.setText("0");
        label_canard_prix_abattage.setText("0€");
        label_poulet_prix_abattage.setText("0€");
    }

    /***
     * Add volaille to the elevage
     */
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
        actualiserAbattage();
    }

    /***
     * Set the price of the canard
     */
    public void setPrixCanard() {
        Canard.setPrix_canard(Double.parseDouble(set_prix_canard.getText()));
        prix_canard.setText(Canard.getPrix_canard().toString()+"€/Kg");
        set_prix_canard.setText("");
    }

    /***
     *  Set the weight of the canard
     */
    public void setPoidCanard() {
        Canard.setPoids_abattage(Integer.parseInt(set_poid_canard.getText()));
        abattage_canard.setText(Canard.getPoids_abattage()+"Kg");
        set_poid_canard.setText("");
    }

    /***
     * Set the price of the Poulet
     */
    public void setPrixPoulet() {
        Poulet.setPrix_poulet(Double.parseDouble(set_prix_poulet.getText()));
        prix_poulet.setText(Poulet.getPrix_poulet().toString()+"€/Kg");
        set_prix_poulet.setText("");
    }

    /***
     * Set the weight of the Poulet
     */
    public void setPoidPoulet() {
        Poulet.setPoids_abattage(Integer.parseInt(set_poid_poulet.getText()));
        abattage_poulet.setText(Poulet.getPoids_abattage()+"Kg");
        set_poid_poulet.setText("");
    }

    /***
     * Update the Abattage instance
     */
    public void actualiserAbattage() {
        Double total_canard = 0.0;
        int compt_canard = 0;
        int canard_dessous = 0;
        int poulet_dessous = 0;
        Double total_poulet = 0.0;
        int compt_poulet = 0;
        for (Pair<Volaille, Double> vol: elevage.listeAbbatable()) {
            if (vol.getKey() instanceof Poulet) {
                compt_poulet++;
                total_poulet = vol.getValue();
            } else {
                compt_canard++;
                total_canard = vol.getValue();
            }
        }
        label_poulet_prix_abattage.setText(total_poulet +"€");
        label_canard_prix_abattage.setText(total_canard +"€");
        label_poulet_abattage.setText(Integer.toString(compt_poulet));
        label_canard_abattage.setText(Integer.toString(compt_canard));

//        for (Volaille vol: elevage.getElevage()) {
//            if (!vol.abbatable() && vol instanceof Poulet) {
//                poulet_dessous++;
//            } else if (!vol.abbatable() && vol instanceof Canard) {
//                canard_dessous++;
//            }
//        }
//        label_poulet_dessouspoid.setText(Integer.toString(poulet_dessous));
//        label_canard_dessouspoid.setText(Integer.toString(canard_dessous));
    }

    void resetTableau() {
    }

    public void sendMail() throws IOException {
        String canard_abbattage = label_canard_abattage.getText();
        String canard_valeur_stock = label_canard_prix_abattage.getText();
        String poulet_abbattage = label_poulet_abattage.getText();
        String poulet_valeur_stock = label_poulet_prix_abattage.getText();
        String mail_destinataire = MailRecipient.getText();
        mail.EnvoiInventaire(canard_abbattage,canard_valeur_stock,poulet_abbattage,poulet_valeur_stock,mail_destinataire);
    }
}