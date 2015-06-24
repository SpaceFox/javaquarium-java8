package info.kisai.javaquarium.java8;

public class Main {

    public static void main(String... args) {
	    Aquarium aquarium = new Aquarium();
        aquarium.addAlgue();
        aquarium.tourSuivant();
        aquarium.addPoisson("Miles", Poisson.Sexe.MALE);
        aquarium.addPoisson("Cordelia", Poisson.Sexe.FEMELLE);
        aquarium.tourSuivant();
        aquarium.addAlgue();
        aquarium.tourSuivant();
    }
}
