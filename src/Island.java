import Organism.Organism;

import java.util.List;
import java.util.Random;

public class Island {
    public static volatile Random random = new Random();
    ListOrganism listOfOrganism = new ListOrganism();
    Location location = new Location();
    Organism organism = new Organism();
    private Organism[][] calls;

    public Island(int width, int length, List<Organism> list) {
        calls = new Organism[width][length];
        initialIsland(list);
    }
         public void initialIsland(List<Organism>list){
            for (int i = 0; i < calls.length; i++) {
                for (int j = 0; j < calls[i].length; j++) {
                    int randomOrganism = random.nextInt(list.size());
                  calls[i][j] = list.get(randomOrganism);
                }
            }
        }
        public void getOrganism () {
            for (int i = 0; i < calls.length; i++) {
                for (int j = 0; j < calls[i].length; j++) {
                    System.out.print(calls[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }


