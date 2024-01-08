package org.volaille.volaille_back;

import java.util.Scanner;

/**
 * La classe Poulet hérite de la classe Volaille.
 */
public class Poulet extends Volaille {

    static Double prix_poulet = 12.0;
    static int poids_abattage = 2;

    /**
     * Constructeur de la classe Poulet.
     * @param id
     * ID de la bague du Poulet
     * @param kg
     * Poid du poulet
     */
    public Poulet(int id, Double kg) {
        super(id, kg);
    }

    /**
     * Calcul du prix du poulet.
     * @return calcul_prix()
     * Retourne le prix du poulet.
     */
    @Override
    public Double calcul_prix() {
        return prix_poulet*this.kg;
    }

    /**
     * Définit le prix du poulet.
     */
    @Override
    public void affecter_prix() {
        Scanner scan = new Scanner(System.in);
        System.out.println("== Quel est le prix du poulet au kilo ? ==");
        prix_poulet = scan.nextDouble();
        scan.close();
    }

    /**
     * Définit le poids d'abattage du poulet.
     */
    @Override
    public void definir_poids_abattage() {
        Scanner scan = new Scanner(System.in);
        System.out.println("== Quel est le poids d'abattage du poulet ? ==");
        poids_abattage = scan.nextInt();
        scan.close();
    }

    /**
     * Vérifier si le pulet est abattable.
     * @return true si le poulet est abattable.
     * @see Volaille#abbatable()
     * @see Poulet#definir_poids_abattage()
     */
    @Override
    public boolean abbatable() {
        return kg>=poids_abattage;
    }
}
