package Animal.Predatores;

public class Eagle extends Predators {
    private final String eagleIcon = "\uD83E\uDD85";

    private final double weightOfAnimal = 6d;
    private final int maxAnimalsInCell = 20;
    private final int speedOfAnimal = 3;
    private final double weightOfFullSaturation = 1d;
    private boolean isAlive = true;

    public String getEagleIcon() {
        return eagleIcon;
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
