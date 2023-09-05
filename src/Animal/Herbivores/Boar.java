package Animal.Herbivores;

import Animal.Herbivores.Herbivores;

public class Boar extends Herbivores {
    private final String boarIcon = "\uD83D\uDC17";
    private final double weightOfAnimal = 400d;
    private final int maxAnimalsInCell = 50;
    private final int speedOfAnimal = 2;
    private final double weightOfFullSaturation = 50d;
    private boolean isAlive = true;

    public String getBoarIcon() {
        return boarIcon;
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
