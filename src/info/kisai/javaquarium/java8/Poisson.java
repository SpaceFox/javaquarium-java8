package info.kisai.javaquarium.java8;

/**
 * Created by spacefox on 24/06/15.
 */
public class Poisson {

    public enum Sexe {
        MALE,
        FEMELLE,
    }

    private String nom;
    private Sexe sexe;

    public Poisson(String nom, Sexe sexe) {
        this.nom = nom;
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public Sexe getSexe() {
        return sexe;
    }
}
