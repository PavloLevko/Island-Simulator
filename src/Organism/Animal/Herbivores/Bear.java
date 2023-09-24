package Organism.Animal.Herbivores;

import Organism.Animal.Predatores.Snake;
import Organism.Organism;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Bear extends Herbivores {
    private final String bearIcon = "\uD83D\uDC3B";
    private final double weightOfAnimal = 500d;
    private final int maxAnimalsInCell = 5;
    private final int speedOfAnimal = 2;
    private final double weightOfFullSaturation = 80d;
    private boolean isAlive = true;
    private int health = 3;
    private Map<Class<? extends Organism>, Integer> whoCanBeEaten = new HashMap<
            >();

    public Bear() {
        setAnimalIcon(bearIcon);
        setWeightOfAnimal(weightOfAnimal);
        setMaxAnimalsInCell(maxAnimalsInCell);
        setSpeedOfAnimal(speedOfAnimal);
        setWeightOfFullSaturation(weightOfFullSaturation);
        setAlive(isAlive);
        setHealth(3);
        whoCanBeEaten.put(Snake.class, 80);
        whoCanBeEaten.put(Horse.class, 40);
        whoCanBeEaten.put(Deer.class, 80);
        whoCanBeEaten.put(Rabbit.class, 80);
        whoCanBeEaten.put(Mouse.class, 90);
        whoCanBeEaten.put(Goat.class, 60);
        whoCanBeEaten.put(Sheep.class, 70);
        whoCanBeEaten.put(Boar.class, 50);
        whoCanBeEaten.put(Buffalo.class, 20);
        whoCanBeEaten.put(Duck.class, 10);
    }
    public <T extends Organism> void eat(T organism) {
        int value = whoCanBeEaten.getOrDefault(organism.getClass(), -1);
       if(value == -1) {
           if (weightOfAnimal<=0){
               isAlive = false;
               System.out.println("помирає");
           }else {
               System.out.println("Не може бути зїджена");
               setWeightOfAnimal(weightOfAnimal-weightOfFullSaturation);
           }
       }else {
            setWeightOfAnimal(weightOfAnimal + weightOfFullSaturation );
            System.out.println("тварина зїджена");
        }
        }

        public void move(){

        }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bear bear = (Bear) o;
        return Double.compare(weightOfAnimal, bear.weightOfAnimal) == 0 && maxAnimalsInCell == bear.maxAnimalsInCell && speedOfAnimal == bear.speedOfAnimal && Double.compare(weightOfFullSaturation, bear.weightOfFullSaturation) == 0 && isAlive == bear.isAlive && health == bear.health && Objects.equals(bearIcon, bear.bearIcon) && Objects.equals(whoCanBeEaten, bear.whoCanBeEaten);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bearIcon, weightOfAnimal, maxAnimalsInCell, speedOfAnimal, weightOfFullSaturation, isAlive, health, whoCanBeEaten);
    }
}

