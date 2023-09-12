package Organism.Animal.Predatores;

import Organism.Animal.Herbivores.Duck;
import Organism.Animal.Herbivores.Mouse;
import Organism.Animal.Herbivores.Rabbit;
import Organism.Organism;

import java.util.HashMap;
import java.util.Map;

public class Snake extends Predators {
    private final String snakeIcon = "\uD83D\uDC0D";
    private final double weightOfAnimal = 15d;
    private final int maxAnimalsInCell = 30;
    private final int speedOfAnimal = 1;
    private final double weightOfFullSaturation = 3d;
    private boolean isAlive = true;
    private Map<Organism, Integer> whoCanBeEaten = new HashMap<Organism, Integer>();
    public Snake(){
        setAnimalIcon(snakeIcon);
        setWeightOfAnimal(weightOfAnimal);
        setMaxAnimalsInCell(maxAnimalsInCell);
        setSpeedOfAnimal(speedOfAnimal);
        setWeightOfFullSaturation(weightOfFullSaturation);
        setAlive(isAlive);
        whoCanBeEaten = Map.of(new Fox(),15,new Rabbit(),20,
                new Mouse(),40,new Duck(),10);
    }
}
