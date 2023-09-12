package Organism.Animal.Predatores;

import Organism.Animal.Herbivores.Duck;
import Organism.Animal.Herbivores.Rabbit;
import Organism.Organism;

import java.util.HashMap;
import java.util.Map;

public class Eagle extends Predators {
    private final String eagleIcon = "\uD83E\uDD85";

    private final double weightOfAnimal = 6d;
    private final int maxAnimalsInCell = 20;
    private final int speedOfAnimal = 3;
    private final double weightOfFullSaturation = 1d;
    private boolean isAlive = true;
    private Map<Organism, Integer> whoCanBeEaten = new HashMap<Organism, Integer>();
    public Eagle(){
        setAnimalIcon(eagleIcon);
        setWeightOfAnimal(weightOfAnimal);
        setMaxAnimalsInCell(maxAnimalsInCell);
        setSpeedOfAnimal(speedOfAnimal);
        setWeightOfFullSaturation(weightOfFullSaturation);
        setAlive(isAlive);
        whoCanBeEaten = Map.of(new Fox(),10,new Rabbit(),90,new Duck(),80);
    }
}
