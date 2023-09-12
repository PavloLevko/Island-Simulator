package Organism.Animal.Herbivores;

import Organism.Organism;
import Organism.Plants;
import java.util.HashMap;
import java.util.Map;

public class Mouse extends Herbivores {
    private final String mouseIcon = "\uD83D\uDC01";
    private final double weightOfAnimal = 0.05d;
    private final int maxAnimalsInCell = 500;
    private final int speedOfAnimal = 1;
    private final double weightOfFullSaturation = 0.01d;
    private boolean isAlive = true;
    private Map<Organism, Integer> whoCanBeEaten = new HashMap<Organism, Integer>();
    public Mouse(){
        setAnimalIcon(mouseIcon);
        setWeightOfAnimal(weightOfAnimal);
        setMaxAnimalsInCell(maxAnimalsInCell);
        setSpeedOfAnimal(speedOfAnimal);
        setWeightOfFullSaturation(weightOfFullSaturation);
        setAlive(isAlive);
        whoCanBeEaten = Map.of(new Caterpillar(),90,new Plants(),100);
    }
}
