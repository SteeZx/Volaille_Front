package org.volaille.volaille_back;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe de l'élevage de volailles.
 */
public class Elevage {
    ArrayList<Volaille> elevage = new ArrayList<>();
    static int id;

    /**
     * Méthode pour ajouter une volaille à l'élevage.
     */
    public void ajouterVolaille() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Poids de la volaille");
        Double poids = scan.nextDouble();
        System.out.println("Quel type de volaille est-ce ?");
        System.out.println("1- Poulet ?");
        System.out.println("2- Canard ?");
        int type = scan.nextInt();
        switch (type){
            case 1:
                this.elevage.add(new Poulet(poids));
                id++;
            case 2:
                this.elevage.add(new Canard(poids));
                id++;
        }
    }

    /**
     * Méthode pour ajouter plusieurs volailles à l'élevage.
     * @param arr liste des volailles à ajouter
     */
    public void ajouterVolaille(ArrayList<Volaille> arr){
        this.elevage.addAll(arr);
    }

    /**
     * Méthode pour lister les volailles abbatables.
     * @return cp liste des volailles abbatables et leur prix.
     */
    ArrayList<Pair<Volaille, Double>> listeAbbatable() {
        ArrayList<Pair<Volaille, Double>> cp = new ArrayList<>();
        for (Volaille v : this.elevage) {
            if (v.abbatable()) {
                cp.add(new Pair<>(v, v.calcul_prix()));
            }
        }
        return cp;
    }
}
