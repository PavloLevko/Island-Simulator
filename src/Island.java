import Animal.Animal;

import java.util.List;

public class Island {
    private int widthIsland;
    private int lengthIsland;
    int[][] sectionOfTheIsland;
    ListOfAnimals listOfAnimals = new ListOfAnimals();
    public Island(int widthIsland, int lengthIsland) {
        this.widthIsland = widthIsland;
        this.lengthIsland = lengthIsland;
    }
    public int getLengthIsland() {
        return lengthIsland;
    }
    public int getWidthIsland() {
        return widthIsland;
    }
    public void fillAnimalsToArray() {
        sectionOfTheIsland = new int[widthIsland][lengthIsland];
        for (int i = 0; i < lengthIsland-1; i++) {
            for (int j = 0; j < widthIsland-1; j++) {
                sectionOfTheIsland[i][j] = listOfAnimals.createRandomAnimal();
            }
        }
    }

    public void getAnimalsArray() {
        for (int i = 0; i < lengthIsland; i++) {
            for (int j = 0; j < widthIsland; j++) {
                System.out.println( " 5 " + sectionOfTheIsland[i][j]);
            }
        }
    }
}