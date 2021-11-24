package lesson6;

import java.util.*;

public class AnimalRacing {

    public static void main(String[] args) {
        Animal winner;
        List<Animal> animalList = new ArrayList<>();

        Animal horse = new Animal("Horse", 75);

        Animal tiger = new Animal("Tiger", 100);

        Animal dog = new Animal("Dog", 60);

        animalList.add(horse);
        animalList.add(tiger);
        animalList.add(dog);

        winner = animalList.get(0);

        for (int i = 0; i < animalList.size(); i++) {
            if(animalList.get(i).getSpeed() > winner.getSpeed()){
                winner = animalList.get(i);
            }
        }

        System.out.println("Winner is " + winner.getAnimalName() + " with speed: " + winner.getSpeed());
    }
}
