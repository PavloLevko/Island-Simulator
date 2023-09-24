package Organism.Animal.Herbivores;

import Organism.Organism;
import Organism.Plants;
import java.util.HashMap;
import java.util.Map;

public class Horse extends Herbivores {
    private final String horseIcon = "\uD83D\uDC0E";

    private final double weightOfAnimal = 400d;
    private final int maxAnimalsInCell = 20;
    private final int speedOfAnimal = 4;
    private final double weightOfFullSaturation = 60d;
    private boolean isAlive = true;
    private Map<Organism, Integer> whoCanBeEaten = new HashMap<Organism, Integer>();
    public Horse(){
        setAnimalIcon(horseIcon);
        setWeightOfAnimal(weightOfAnimal);
        setMaxAnimalsInCell(maxAnimalsInCell);
        setSpeedOfAnimal(speedOfAnimal);
        setWeightOfFullSaturation(weightOfFullSaturation);
        setAlive(isAlive);
        whoCanBeEaten = Map.of(new Plants(),100);
    }
}
