package Animal.Predatores;

public class Fox extends Predators {
    private final String foxIcon = "\uD83E\uDD8A";
    private final double weightOfAnimal = 8d;
    private final int maxAnimalsInCell = 30;
    private final int speedOfAnimal = 2;
    private final double weightOfFullSaturation = 2d;
    private boolean isAlive = true;

    public String getFoxIcon() {
        return foxIcon;
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
