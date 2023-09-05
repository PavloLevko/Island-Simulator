package Animal.Herbivores;

import Animal.Herbivores.Herbivores;

public class Caterpillar extends Herbivores {
    private final String caterpillarIcon = "\uD83D\uDC1B";
    private final double weightOfAnimal = 0.01d;
    private final int maxAnimalsInCell = 1000;
    private final int speedOfAnimal = 0;
    private final double weightOfFullSaturation = 0d;
    private boolean isAlive = true;

    public String getCaterpillarIcon() {
        return caterpillarIcon;
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
