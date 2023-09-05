package Animal.Herbivores;

import Animal.Herbivores.Herbivores;

public class Buffalo extends Herbivores {
    private final String buffaloIcon = "\uD83D\uDC03";
    private final double weightOfAnimal = 700d;
    private final int maxAnimalsInCell = 10;
    private final int speedOfAnimal = 3;
    private final double weightOfFullSaturation = 100d;
    private boolean isAlive = true;

    public String getBuffaloIcon() {
        return buffaloIcon;
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
