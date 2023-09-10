package Animal.Predatores;

public class Wolf extends Predators {

    private final String wolfIcon = "\uD83D\uDC3A";
    private final double weightOfAnimal = 50d;
    private final int maxAnimalsInCell = 30;
    private final int speedOfAnimal = 3;
    private final double weightOfFullSaturation = 8d;
    private boolean isAlive = true;
    public Wolf(){
        setAnimalIcon(wolfIcon);
        setWeightOfAnimal(weightOfAnimal);
        setMaxAnimalsInCell(maxAnimalsInCell);
        setSpeedOfAnimal(speedOfAnimal);
        setWeightOfFullSaturation(weightOfFullSaturation);
        setAlive(isAlive);
    }
}
