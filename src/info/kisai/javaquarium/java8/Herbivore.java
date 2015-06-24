package info.kisai.javaquarium.java8;

/**
 * Created by spacefox on 24/06/15.
 */
public interface Herbivore {
    default void mange(Algue algue) {
        // Ne fait rien pour le moment
    }
}
