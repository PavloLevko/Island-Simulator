package Animal.Herbivores;

import Animal.Herbivores.Herbivores;

public class Mouse extends Herbivores {
    private final String mouseIcon = "\uD83D\uDC01";
    private final double weightOfAnimal = 0.05d;
    private final int maxAnimalsInCell = 500;
    private final int speedOfAnimal = 1;
    private final double weightOfFullSaturation = 0.01d;
    private boolean isAlive = true;

    public String getMouseIcon() {
        return mouseIcon;
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
