package Animal.Herbivores;

import Animal.Herbivores.Herbivores;

public class Duck extends Herbivores {
    private final String duckIcon = "\uD83E\uDD86";
    private final double weightOfAnimal = 1d;
    private final int maxAnimalsInCell = 200;
    private final int speedOfAnimal = 4;
    private final double weightOfFullSaturation = 0.15d;
    private boolean isAlive = true;
    public Duck(){
        setAnimalIcon(duckIcon);
        setWeightOfAnimal(weightOfAnimal);
        setMaxAnimalsInCell(maxAnimalsInCell);
        setSpeedOfAnimal(speedOfAnimal);
        setWeightOfFullSaturation(weightOfFullSaturation);
        setAlive(isAlive);
    }
}
