package Animal.Predatores;

public class Fox extends Predators {
    private final String foxIcon = "\uD83E\uDD8A";
    private final double weightOfAnimal = 8d;
    private final int maxAnimalsInCell = 30;
    private final int speedOfAnimal = 2;
    private final double weightOfFullSaturation = 2d;
    private boolean isAlive = true;
    public Fox(){
        setAnimalIcon(foxIcon);
        setWeightOfAnimal(weightOfAnimal);
        setMaxAnimalsInCell(maxAnimalsInCell);
        setSpeedOfAnimal(speedOfAnimal);
        setWeightOfFullSaturation(weightOfFullSaturation);
        setAlive(isAlive);
    }
}
