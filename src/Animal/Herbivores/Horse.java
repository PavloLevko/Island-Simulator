package Animal.Herbivores;

import Animal.Herbivores.Herbivores;

public class Horse extends Herbivores {
    private final String horseIcon = "\uD83D\uDC0E";

    private final double weightOfAnimal = 400d;
    private final int maxAnimalsInCell = 20;
    private final int speedOfAnimal = 4;
    private final double weightOfFullSaturation = 60d;
    private boolean isAlive = true;

    public String getHorseIcon() {
        return horseIcon;
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
