package Animal;

import Animal.Predators;

public class Wolf extends Predators {
    private final String wolfIcon = "\uD83D\uDC3A";

    public String getWolfIcon() {
        return wolfIcon;
    }

    @Override
    public String toString() {
        return "Animal.Wolf{" +
                "wolfIcon='" + wolfIcon + '\'' +
                '}';
    }
}
