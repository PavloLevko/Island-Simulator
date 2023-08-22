import  Animal.Animal;
import Animal.Boar;
import Animal.Bear;
import Animal.Buffalo;
import Animal.Caterpillar;
import Animal.Duck;
import Animal.Deer;
import Animal.Eagle;
import Animal.Fox;
import Animal.Goat;
import Animal.Horse;
import Animal.Mouse;
import Animal.Rabbit;
import Animal.Sheep;
import Animal.Snake;
import Animal.Wolf;

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

    public int createRandomAnimal(List<Animal> animals){
        Random random = new Random();
        animalNumber = random.nextInt(animals.size());
        return animalNumber;
    }

}
