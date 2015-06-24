package info.kisai.javaquarium.java8;

/**
 * Created by spacefox on 24/06/15.
 */
public interface Carnivore {
    default void mange(Poisson poisson) {
        // Ne fait rien pour le moment
    }
}
