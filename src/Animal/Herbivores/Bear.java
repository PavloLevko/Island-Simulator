package Animal.Herbivores;

public class Bear extends Herbivores {
    private final String bearIcon = "\uD83D\uDC3B";
    private final double weightOfAnimal = 500d;
    private final int maxAnimalsInCell = 5;
    private final int speedOfAnimal = 2;
    private final double weightOfFullSaturation = 80d;
    private boolean isAlive = true;

    public String getBearIcon() {
        return bearIcon;
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
