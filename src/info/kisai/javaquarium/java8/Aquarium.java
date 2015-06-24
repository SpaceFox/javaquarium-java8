package info.kisai.javaquarium.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by spacefox on 24/06/15.
 */
public class Aquarium {

    private final List<Poisson> poissons = new ArrayList<>();
    private final List<Algue> algues = new ArrayList<>();

    private int tour = 1;

    public void addPoisson(Poisson poisson) {
        poissons.add(poisson);
    }

    public void addAlgue() {
        algues.add(new Algue());
    }

    public void tourSuivant() {
        System.out.println("===== Contenu de l'aquarium au tour " + tour + " =====");
        System.out.println(algues.size() + " algues");
        System.out.println(poissons.size() + " poissons :");
        for (Poisson poisson : poissons) {
            System.out.println("\t" + poisson);
        }

        tour++;
    }
}
