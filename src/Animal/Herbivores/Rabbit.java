package Animal.Herbivores;

import Animal.Herbivores.Herbivores;

public class Rabbit extends Herbivores {
    private final String rabbitIcon = "\uD83D\uDC07";
    private final double weightOfAnimal = 2d;
    private final int maxAnimalsInCell = 150;
    private final int speedOfAnimal = 2;
    private final double weightOfFullSaturation = 0.45d;
    private boolean isAlive = true;

    public String getRabbitIcon() {
        return rabbitIcon;
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
