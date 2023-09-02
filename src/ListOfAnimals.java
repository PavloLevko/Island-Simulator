import  Animal.Animal;
import Animal.Herbivores.Boar;
import Animal.Herbivores.Bear;
import Animal.Herbivores.Buffalo;
import Animal.Herbivores.Caterpillar;
import Animal.Herbivores.Duck;
import Animal.Herbivores.Deer;
import Animal.Predatores.Eagle;
import Animal.Predatores.Fox;
import Animal.Herbivores.Goat;
import Animal.Herbivores.Horse;
import Animal.Herbivores.Mouse;
import Animal.Herbivores.Rabbit;
import Animal.Herbivores.Sheep;
import Animal.Predatores.Snake;
import Animal.Predatores.Wolf;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
ListOfAnimals listOfAnimals = new ListOfAnimals();
    public int createRandomAnimal(){
        Random random = new Random();
        animalNumber = random.nextInt(listOfAnimals.animalList.size());
        return animalNumber;
    }

}
