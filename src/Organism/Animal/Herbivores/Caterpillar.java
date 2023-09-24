package Organism.Animal.Herbivores;

import Organism.Organism;
import Organism.Plants;
import java.util.HashMap;
import java.util.Map;

public class Caterpillar extends Herbivores {
    private final String caterpillarIcon = "\uD83D\uDC1B";
    private final double weightOfAnimal = 0.01d;
    private final int maxAnimalsInCell = 1000;
    private final int speedOfAnimal = 0;
    private final double weightOfFullSaturation = 0d;
    private boolean isAlive = true;
    private Map<Organism, Integer> whoCanBeEaten = new HashMap<Organism, Integer>();
    public Caterpillar(){
        setAnimalIcon(caterpillarIcon);
        setWeightOfAnimal(weightOfAnimal);
        setMaxAnimalsInCell(maxAnimalsInCell);
        setSpeedOfAnimal(speedOfAnimal);
        setWeightOfFullSaturation(weightOfFullSaturation);
        setAlive(isAlive);
        whoCanBeEaten = Map.of(new Plants(),100);
    }
}
