package org.volaille.volaille_back;

import org.volaille.volaille_back.Volaille;

import java.util.Scanner;

/**
 * La classe Canard hérite de Volaille.
 */
public class Canard extends Volaille {

    static Double prix_canard = 5.0;
    static int poids_abattage = 1;

    public static Double getPrix_canard() {
        return prix_canard;
    }

    public static void setPrix_canard(Double prix_canard) {
        Canard.prix_canard = prix_canard;
    }

    public static int getPoids_abattage() {
        return poids_abattage;
    }

    public static void setPoids_abattage(int poids_abattage) {
        Canard.poids_abattage = poids_abattage;
    }

    /**
     * Constructeur de la classe Canard.
     * @param id
     * ID de la bague du Canard
     * @param kg
     * Poid du canard
     */
    public Canard(Double kg) {
        super(kg);

    }

    /**
     * Calcul du prix du canard.
     * @return prix_canard*this.kg
     * Le prix du canard multiplié par le poid du canard.
     */
    @Override
    public Double calcul_prix() {
        return prix_canard*this.kg;
    }

    /**
     * Définir le prix du canard au kilo.
     */
    @Override
    public void affecter_prix() {
        Scanner scan = new Scanner(System.in);
        System.out.println("== Quel est le prix du canard au kilo ? ==");
        prix_canard = scan.nextDouble();
        scan.close();
    }

    /**
     * Définir le poids d'abattage du canard.
     */
    @Override
    public void definir_poids_abattage() {
        Scanner scan = new Scanner(System.in);
        System.out.println("== Quel est le poids d'abattage du canard ? ==");
        poids_abattage = scan.nextInt();
        scan.close();
    }

    /**
     * Vérifier si le canard est abattable.
     * @return true si le canard est abattable.
     * @see Volaille#abbatable()
     * @see Canard#poids_abattage
     */
    @Override
    public boolean abbatable() {
        return kg>=poids_abattage;
    }
}
