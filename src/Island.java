import Organism.Animal.Animal;
import Organism.Organism;

import java.util.Random;

public class Island {
    Location location = new Location();
    Random random = new Random();
    ListOfOrganism listOfOrganism = new ListOfOrganism();
   Organism [][] calls;

    public Island(int x, int y) {
        calls = new Organism[x][y];
    }

    public void initialIsland(){
       for (int i = 0; i < calls.length; i++) {
           for (int j = 0; j < calls[i].length; j++) {
               int randomOrganism = random.nextInt(listOfOrganism.list.length);

               calls[i][j]= listOfOrganism.list[randomOrganism];
           }
       }}
    public void getOrganism() {
        for (int i = 0; i < calls.length; i++) {
            for (int j = 0; j < calls[i].length; j++) {
                System.out.print(calls[i][j] + "\t");
            }
            System.out.println();
        }
    }


}

