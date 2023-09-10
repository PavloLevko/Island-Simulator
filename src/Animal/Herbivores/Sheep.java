package Animal.Herbivores;

import Animal.Herbivores.Herbivores;

public class Sheep extends Herbivores {
    private final String sheepIcon = "\uD83D\uDC11";
    private final double weightOfAnimal = 70d;
    private final int maxAnimalsInCell = 140;
    private final int speedOfAnimal = 3;
    private final double weightOfFullSaturation = 15d;
    private boolean isAlive = true;
    public Sheep(){
        setAnimalIcon(sheepIcon);
        setWeightOfAnimal(weightOfAnimal);
        setMaxAnimalsInCell(maxAnimalsInCell);
        setSpeedOfAnimal(speedOfAnimal);
        setWeightOfFullSaturation(weightOfFullSaturation);
        setAlive(isAlive);
    }
}
