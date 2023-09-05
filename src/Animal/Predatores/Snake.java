package Animal.Predatores;

public class Snake extends Predators {
    private final String snakeIcon = "\uD83D\uDC0D";
    private final double weightOfAnimal = 15d;
    private final int maxAnimalsInCell = 30;
    private final int speedOfAnimal = 1;
    private final double weightOfFullSaturation = 3d;
    private boolean isAlive = true;

    public String getSnakeIcon() {
        return snakeIcon;
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
