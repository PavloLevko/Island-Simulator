package Organism.Animal.Herbivores;
import Organism.Organism;
import Organism.Plants;

import java.util.HashMap;
import java.util.Map;

public class Boar extends Herbivores {
    private final String boarIcon = "\uD83D\uDC17";
    private final double weightOfAnimal = 400d;
    private final int maxAnimalsInCell = 50;
    private final int speedOfAnimal = 2;
    private final double weightOfFullSaturation = 50d;
    private boolean isAlive = true;
    private Map<Organism, Integer> whoCanBeEaten = new HashMap<Organism, Integer>();
    public Boar(){
        setAnimalIcon(boarIcon);
        setWeightOfAnimal(weightOfAnimal);
        setMaxAnimalsInCell(maxAnimalsInCell);
        setSpeedOfAnimal(speedOfAnimal);
        setWeightOfFullSaturation(weightOfFullSaturation);
        setAlive(isAlive);
        whoCanBeEaten = Map.of (new Plants(), 100);
    }
}
