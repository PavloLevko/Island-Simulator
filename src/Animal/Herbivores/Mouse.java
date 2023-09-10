package Animal.Herbivores;

import Animal.Herbivores.Herbivores;

public class Mouse extends Herbivores {
    private final String mouseIcon = "\uD83D\uDC01";
    private final double weightOfAnimal = 0.05d;
    private final int maxAnimalsInCell = 500;
    private final int speedOfAnimal = 1;
    private final double weightOfFullSaturation = 0.01d;
    private boolean isAlive = true;
    public Mouse(){
        setAnimalIcon(mouseIcon);
        setWeightOfAnimal(weightOfAnimal);
        setMaxAnimalsInCell(maxAnimalsInCell);
        setSpeedOfAnimal(speedOfAnimal);
        setWeightOfFullSaturation(weightOfFullSaturation);
        setAlive(isAlive);
    }
}
