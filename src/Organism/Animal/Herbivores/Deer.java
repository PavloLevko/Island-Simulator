package Organism.Animal.Herbivores;

import Organism.Organism;
import Organism.Plants;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Deer extends Herbivores {
    private final String deerIcon = "\uD83E\uDD8C";
    private final double weightOfAnimal = 300d;
    private final int maxAnimalsInCell = 20;
    private final int speedOfAnimal = 4;
    private final double weightOfFullSaturation = 50;
    private boolean isAlive = true;
    private Map<Organism, Integer> whoCanBeEaten = new HashMap<Organism, Integer>();
    public Deer(){
        setAnimalIcon(deerIcon);
        setWeightOfAnimal(weightOfAnimal);
        setMaxAnimalsInCell(maxAnimalsInCell);
        setSpeedOfAnimal(speedOfAnimal);
        setWeightOfFullSaturation(weightOfFullSaturation);
        setAlive(isAlive);
        whoCanBeEaten = Map.of(new Plants(),100);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deer deer = (Deer) o;
        return Double.compare(weightOfAnimal, deer.weightOfAnimal) == 0 && maxAnimalsInCell == deer.maxAnimalsInCell && speedOfAnimal == deer.speedOfAnimal && Double.compare(weightOfFullSaturation, deer.weightOfFullSaturation) == 0 && isAlive == deer.isAlive && Objects.equals(deerIcon, deer.deerIcon) && Objects.equals(whoCanBeEaten, deer.whoCanBeEaten);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deerIcon, weightOfAnimal, maxAnimalsInCell, speedOfAnimal, weightOfFullSaturation, isAlive, whoCanBeEaten);
    }
}
