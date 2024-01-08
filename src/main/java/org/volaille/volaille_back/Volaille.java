package org.volaille.volaille_back;

import java.util.Scanner;

/**
 * Classe volaille
 */
abstract public class Volaille {

    Double kg;
    int id;

    /**
     * Constructeur de la classe volaille
     * @param id
     *ID de la bague de la Volaille
     * @param kg
     * Poid de la Volaille
     */
    public Volaille(int id, Double kg) {
        this.id = id;
        this.kg = kg;
    }

    /**
     * Méthode abstraite calcul_prix
     * @return
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
     * @return
     */
    abstract public boolean abbatable();

}
