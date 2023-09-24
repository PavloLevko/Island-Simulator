package Organism.Animal.Predatores;

import Organism.Animal.Herbivores.Caterpillar;
import Organism.Animal.Herbivores.Duck;
import Organism.Animal.Herbivores.Mouse;
import Organism.Animal.Herbivores.Rabbit;
import Organism.Organism;

import java.util.HashMap;
import java.util.Map;

public class Fox extends Predators {
    private final String foxIcon = "\uD83E\uDD8A";
    private final double weightOfAnimal = 8d;
    private final int maxAnimalsInCell = 30;
    private final int speedOfAnimal = 2;
    private final double weightOfFullSaturation = 2d;
    private boolean isAlive = true;
    private Map<Organism, Integer> whoCanBeEaten = new HashMap<Organism, Integer>();
    public Fox(){
        setAnimalIcon(foxIcon);
        setWeightOfAnimal(weightOfAnimal);
        setMaxAnimalsInCell(maxAnimalsInCell);
        setSpeedOfAnimal(speedOfAnimal);
        setWeightOfFullSaturation(weightOfFullSaturation);
        setAlive(isAlive);
        whoCanBeEaten = Map.of(new Rabbit(),70, new Mouse(),90,new Duck(),60,
                new Caterpillar(),40);
    }
}
