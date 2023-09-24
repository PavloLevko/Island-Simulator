package Organism.Animal.Predatores;

import Organism.Animal.Herbivores.Duck;
import Organism.Animal.Herbivores.Mouse;
import Organism.Animal.Herbivores.Rabbit;
import Organism.Organism;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snake snake = (Snake) o;
        return Double.compare(weightOfAnimal, snake.weightOfAnimal) == 0 && maxAnimalsInCell == snake.maxAnimalsInCell && speedOfAnimal == snake.speedOfAnimal && Double.compare(weightOfFullSaturation, snake.weightOfFullSaturation) == 0 && isAlive == snake.isAlive && Objects.equals(snakeIcon, snake.snakeIcon) && Objects.equals(whoCanBeEaten, snake.whoCanBeEaten);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snakeIcon, weightOfAnimal, maxAnimalsInCell, speedOfAnimal, weightOfFullSaturation, isAlive, whoCanBeEaten);
    }
}
