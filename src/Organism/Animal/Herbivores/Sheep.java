package Organism.Animal.Herbivores;

import Organism.Organism;
import Organism.Plants;
import java.util.HashMap;
import java.util.Map;

public class Sheep extends Herbivores {
    private final String sheepIcon = "\uD83D\uDC11";
    private final double weightOfAnimal = 70d;
    private final int maxAnimalsInCell = 140;
    private final int speedOfAnimal = 3;
    private final double weightOfFullSaturation = 15d;
    private boolean isAlive = true;
    private Map<Organism, Integer> whoCanBeEaten = new HashMap<Organism, Integer>();
    public Sheep(){
        setAnimalIcon(sheepIcon);
        setWeightOfAnimal(weightOfAnimal);
        setMaxAnimalsInCell(maxAnimalsInCell);
        setSpeedOfAnimal(speedOfAnimal);
        setWeightOfFullSaturation(weightOfFullSaturation);
        setAlive(isAlive);
        whoCanBeEaten = Map.of(new Plants(),100);
    }
}
