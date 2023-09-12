package Organism.Animal.Herbivores;

import Organism.Animal.Animal;
import Organism.Animal.Predatores.Snake;
import Organism.Organism;


import java.util.HashMap;
import java.util.Map;

public class Bear extends Herbivores {
    private final String bearIcon = "\uD83D\uDC3B";
    private final double weightOfAnimal = 500d;
    private final int maxAnimalsInCell = 5;
    private final int speedOfAnimal = 2;
    private final double weightOfFullSaturation = 80d;
    private boolean isAlive = true;

    private Map<Organism, Integer> whoCanBeEaten = new HashMap<Organism, Integer>();


    public Bear(){
        setAnimalIcon(bearIcon);
        setWeightOfAnimal(weightOfAnimal);
        setMaxAnimalsInCell(maxAnimalsInCell);
        setSpeedOfAnimal(speedOfAnimal);
        setWeightOfFullSaturation(weightOfFullSaturation);
        setAlive(isAlive);
        whoCanBeEaten = Map.of(new Snake(),80,new Horse(),40,new Deer(),80,
                new Rabbit(),80,new Mouse(),90,new Goat(),60,
                new Sheep(),70, new Boar(),50,new Buffalo(),20,new Duck(),10);
    }

}
