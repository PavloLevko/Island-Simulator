package Animal.Herbivores;

import Animal.Herbivores.Herbivores;

public class Rabbit extends Herbivores {
    private final String rabbitIcon = "\uD83D\uDC07";
    private final double weightOfAnimal = 2d;
    private final int maxAnimalsInCell = 150;
    private final int speedOfAnimal = 2;
    private final double weightOfFullSaturation = 0.45d;
    private boolean isAlive = true;
    public Rabbit(){
        setAnimalIcon(rabbitIcon);
        setWeightOfAnimal(weightOfAnimal);
        setMaxAnimalsInCell(maxAnimalsInCell);
        setSpeedOfAnimal(speedOfAnimal);
        setWeightOfFullSaturation(weightOfFullSaturation);
        setAlive(isAlive);
    }
}
