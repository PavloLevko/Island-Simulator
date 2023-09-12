import Organism.Animal.Animal;
import Organism.Animal.Herbivores.*;
import Organism.Animal.Predatores.Eagle;
import Organism.Animal.Predatores.Fox;
import Organism.Animal.Predatores.Snake;
import Organism.Animal.Predatores.Wolf;

import java.util.ArrayList;
import java.util.List;

public class ListOfAnimals extends Animal {
    private int animalNumber;
    List<Animal> animalList = new ArrayList<>();
    public ListOfAnimals(){
        animalList.add(new Bear());
        animalList.add(new Boar());
        animalList.add(new Buffalo());
        animalList.add(new Caterpillar());
        animalList.add(new Deer());
        animalList.add(new Duck());
        animalList.add(new Eagle());
        animalList.add(new Fox());
        animalList.add(new Goat());
        animalList.add(new Horse());
        animalList.add(new Mouse());
        animalList.add(new Rabbit());
        animalList.add(new Snake());
        animalList.add(new Sheep());
        animalList.add(new Wolf());
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }


}
