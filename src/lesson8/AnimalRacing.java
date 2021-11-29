package lesson8;

import java.util.ArrayList;
import java.util.List;

public class AnimalRacing {
    public static void main(String[] args) {
        Animal winner, horse, tiger, dog;
        List<Animal> animalList = new ArrayList<>();

        horse = new Horse("Horse");
        horse.speed(75);

        tiger = new Tiger("Tiger");
        tiger.speed(100);

        dog = new Dog("Dog");
        dog.speed(60);

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
