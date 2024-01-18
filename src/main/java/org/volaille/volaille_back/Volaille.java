package org.volaille.volaille_back;

import java.util.Scanner;

/**
 * Classe volaille
 */
abstract public class Volaille {

    Double kg;
    static int id_all = 1;
    int id;
    String type;

    /**
     * Constructeur de la classe volaille
     * @param kg
     * Poid de la Volaille
     */
    public Volaille(Double kg) {
        this.id = id_all;
        id_all++;
        this.kg = kg;
        if (this instanceof Poulet) {
            type = "Poulet";
        } else {
            type = "Canard";
        }
    }

    /**
     * Méthode abstraite calcul_prix
     */
    abstract public Double calcul_prix();

    /**
     * Méthode abstraite affecter_prix
     */
    abstract public void affecter_prix();

    /**
     * Méthode abstraite definir_poids_abattage
     */
    abstract public void definir_poids_abattage();

    /**
     * Méthode abstraite abbatable
     */
    abstract public boolean abbatable();

    public Double getKg() {
        return kg;
    }

    public void setKg(Double kg) {
        this.kg = kg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
