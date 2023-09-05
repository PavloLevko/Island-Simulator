package Animal.Herbivores;

import Animal.Herbivores.Herbivores;

public class Sheep extends Herbivores {
    private final String sheepIcon = "\uD83D\uDC11";
    private final double weightOfAnimal = 70d;
    private final int maxAnimalsInCell = 140;
    private final int speedOfAnimal = 3;
    private final double weightOfFullSaturation = 15d;
    private boolean isAlive = true;

    public String getSheepIcon() {
        return sheepIcon;
    }

    public double getWeightOfAnimal() {
        return weightOfAnimal;
    }

    public int getMaxAnimalsInCell() {
        return maxAnimalsInCell;
    }

    public int getSpeedOfAnimal() {
        return speedOfAnimal;
    }

    public double getWeightOfFullSaturation() {
        return weightOfFullSaturation;
    }

    public boolean isAlive() {
        return isAlive;
    }
}
