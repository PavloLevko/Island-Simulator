package Animal.Herbivores;

import Animal.Herbivores.Herbivores;

public class Buffalo extends Herbivores {
    private final String buffaloIcon = "\uD83D\uDC03";
    private final double weightOfAnimal = 700d;
    private final int maxAnimalsInCell = 10;
    private final int speedOfAnimal = 3;
    private final double weightOfFullSaturation = 100d;
    private boolean isAlive = true;
    public Buffalo(){
        setAnimalIcon(buffaloIcon);
        setWeightOfAnimal(weightOfAnimal);
        setMaxAnimalsInCell(maxAnimalsInCell);
        setSpeedOfAnimal(speedOfAnimal);
        setWeightOfFullSaturation(weightOfFullSaturation);
        setAlive(isAlive);
    }
}
