package Animal.Herbivores;

import Animal.Herbivores.Herbivores;

public class Goat extends Herbivores {
    private final String goatIcon = "\uD83D\uDC10";
    private final double weightOfAnimal = 60d;
    private final int maxAnimalsInCell = 140;
    private final int speedOfAnimal = 3;
    private final double weightOfFullSaturation = 10d;
    private boolean isAlive = true;

    public String getGoatIcon() {
        return goatIcon;
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
