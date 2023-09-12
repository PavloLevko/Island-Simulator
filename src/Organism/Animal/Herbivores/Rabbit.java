package Organism.Animal.Herbivores;

import Organism.Organism;
import Organism.Plants;
import java.util.HashMap;
import java.util.Map;

public class Rabbit extends Herbivores {
    private final String rabbitIcon = "\uD83D\uDC07";
    private final double weightOfAnimal = 2d;
    private final int maxAnimalsInCell = 150;
    private final int speedOfAnimal = 2;
    private final double weightOfFullSaturation = 0.45d;
    private boolean isAlive = true;
    private Map<Organism, Integer> whoCanBeEaten = new HashMap<Organism, Integer>();
    public Rabbit(){
        setAnimalIcon(rabbitIcon);
        setWeightOfAnimal(weightOfAnimal);
        setMaxAnimalsInCell(maxAnimalsInCell);
        setSpeedOfAnimal(speedOfAnimal);
        setWeightOfFullSaturation(weightOfFullSaturation);
        setAlive(isAlive);
        whoCanBeEaten = Map.of(new Plants(),100);
    }
}
