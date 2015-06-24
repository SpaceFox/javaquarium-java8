package info.kisai.javaquarium.java8;

public class Main {

    public static void main(String... args) {
	    Aquarium aquarium = new Aquarium();
        aquarium.addAlgue();
        aquarium.tourSuivant();
        aquarium.addPoisson(new Mérou("Miles", Poisson.Sexe.MALE));
        aquarium.addPoisson(new Thon("Cordelia", Poisson.Sexe.FEMELLE));
        aquarium.tourSuivant();
        aquarium.addAlgue();
        aquarium.addPoisson(new PoissonClown("Aral", Poisson.Sexe.MALE));
        aquarium.addPoisson(new Sole("Ivan", Poisson.Sexe.MALE));
        aquarium.tourSuivant();
        aquarium.addPoisson(new Bar("Elena", Poisson.Sexe.FEMELLE));
        aquarium.addAlgue();
        aquarium.addPoisson(new Carpe("Elli", Poisson.Sexe.FEMELLE));
        aquarium.tourSuivant();
    }
}
