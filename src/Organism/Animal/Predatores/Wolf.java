package Organism.Animal.Predatores;

import Organism.Animal.Herbivores.*;
import Organism.Organism;

import java.util.HashMap;
import java.util.Map;

public class Wolf extends Predators {

    private final String wolfIcon = "\uD83D\uDC3A";
    private final double weightOfAnimal = 50d;
    private final int maxAnimalsInCell = 30;
    private final int speedOfAnimal = 3;
    private final double weightOfFullSaturation = 8d;
    private boolean isAlive = true;
    private Map<Organism, Integer> whoCanBeEaten = new HashMap<Organism, Integer>();
    public Wolf(){
        setAnimalIcon(wolfIcon);
        setWeightOfAnimal(weightOfAnimal);
        setMaxAnimalsInCell(maxAnimalsInCell);
        setSpeedOfAnimal(speedOfAnimal);
        setWeightOfFullSaturation(weightOfFullSaturation);
        setAlive(isAlive);
        whoCanBeEaten = Map.of(new Horse(),10,new Deer(),15,new Rabbit(),60,
                new Mouse(),80,new Goat(),60,new Sheep(),70,new Boar(),15,
                new Buffalo(),10,new Duck(),40);
    }
}
