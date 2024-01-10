package org.volaille.volaille_back;

import java.util.Scanner;

/**
 * La classe Poulet hérite de la classe Volaille.
 */
public class Poulet extends Volaille {


    static Double prix_poulet = 12.0;
    static int poids_abattage = 2;

    /***
     * Retourne le prix du poulet.
     * @return prix_poulet
     */
    public static Double getPrix_poulet() {
        return prix_poulet;
    }

    /***
     * Définit le prix du poulet.
     * @param prix_poulet Prix du poulet
     */
    public static void setPrix_poulet(Double prix_poulet) {
        Poulet.prix_poulet = prix_poulet;
    }

    /***
     * Retourne le poids d'abattage du poulet.
     * @return poids_abattage
     */
    public static int getPoids_abattage() {
        return poids_abattage;
    }

    /***
     * Définit le poids d'abattage du poulet.
     * @param poids_abattage
     */
    public static void setPoids_abattage(int poids_abattage) {
        Poulet.poids_abattage = poids_abattage;
    }

    /**
     * Constructeur de la classe Poulet.
     * @param kg
     * Poid du poulet
     */
    public Poulet(Double kg) {
        super(kg);
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
