import Animal.Animal;

import java.util.List;

public class Island {
    private int widthIsland;
    private int lengthIsland;
    Object[][] sectionOfTheIsland;
    ListOfAnimals listOfAnimals = new ListOfAnimals();

    public int getWidthIsland() {
        return widthIsland;
    }

    public void setWidthIsland(int widthIsland) {
        this.widthIsland = widthIsland;
    }

    public int getLengthIsland() {
        return lengthIsland;
    }

    public void setLengthIsland(int lengthIsland) {
        this.lengthIsland = lengthIsland;
    }

    public Object[][] getSectionOfTheIsland() {
        return sectionOfTheIsland;
    }

    public void setSectionOfTheIsland(Object[][] sectionOfTheIsland) {
        this.sectionOfTheIsland = sectionOfTheIsland;
    }
}