import Organism.Animal.Herbivores.*;
import Organism.Animal.Predatores.Eagle;
import Organism.Animal.Predatores.Fox;
import Organism.Animal.Predatores.Snake;
import Organism.Animal.Predatores.Wolf;
import Organism.Organism;
import Organism.Plants;

import java.util.ArrayList;
import java.util.List;

public class ListOrganism {
    List<Organism> listOfOrganism = new ArrayList<>();
    {
        listOfOrganism.add(0,new Bear());
        listOfOrganism.add(1,new Boar());
        listOfOrganism.add(2,new Buffalo());
        listOfOrganism.add(3,new Caterpillar());
        listOfOrganism.add(4,new Deer());
        listOfOrganism.add(5,new Duck());
        listOfOrganism.add(6,new Goat());
        listOfOrganism.add(7,new Mouse());
        listOfOrganism.add(8,new Horse());
        listOfOrganism.add(9,new Rabbit());
        listOfOrganism.add(10,new Sheep());
        listOfOrganism.add(11,new Eagle());
        listOfOrganism.add(12,new Fox());
        listOfOrganism.add(13, new Snake());
        listOfOrganism.add(14,new Wolf());
        listOfOrganism.add(15,new Snake());
        listOfOrganism.add(16,new Plants());
    }
}
