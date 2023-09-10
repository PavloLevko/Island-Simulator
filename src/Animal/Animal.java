package Animal;

public abstract class Animal extends Organism{
    private String animalIcon;
    private double weightOfAnimal;
    private int maxAnimalsInCell;
    private int speedOfAnimal;
    private double weightOfFullSaturation;
    private boolean isAlive;

    public void eat (){
    }
    public void reproduce (){
    }
    public void move (){
    }
    public void dead(){
    }

    public String getAnimalIcon() {
        return animalIcon;
    }

    public void setAnimalIcon(String animalIcon) {
        this.animalIcon = animalIcon;
    }

    public double getWeightOfAnimal() {
        return weightOfAnimal;
    }

    public void setWeightOfAnimal(double weightOfAnimal) {
        this.weightOfAnimal = weightOfAnimal;
    }

    public int getMaxAnimalsInCell() {
        return maxAnimalsInCell;
    }

    public void setMaxAnimalsInCell(int maxAnimalsInCell) {
        this.maxAnimalsInCell = maxAnimalsInCell;
    }

    public int getSpeedOfAnimal() {
        return speedOfAnimal;
    }

    public void setSpeedOfAnimal(int speedOfAnimal) {
        this.speedOfAnimal = speedOfAnimal;
    }

    public double getWeightOfFullSaturation() {
        return weightOfFullSaturation;
    }

    public void setWeightOfFullSaturation(double weightOfFullSaturation) {
        this.weightOfFullSaturation = weightOfFullSaturation;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
