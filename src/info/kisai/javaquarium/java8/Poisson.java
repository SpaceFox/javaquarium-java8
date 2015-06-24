package info.kisai.javaquarium.java8;

/**
 * Created by spacefox on 24/06/15.
 */
public abstract class Poisson {

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

    @Override
    public String toString() {
        return nom + " (" + getClass().getSimpleName() + ", " + sexe + ")";
    }
}
