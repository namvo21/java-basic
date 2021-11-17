package lesson6;

import java.util.*;

public class AnimalRacing {

    public static void main(String[] args) {
        Animal winner;
        List<Animal> animalList = new ArrayList<>();

        Animal horse = new Horse();
        horse.setAnimalName("Horse");
        horse.speed();

        Animal tiger = new Tiger();
        tiger.setAnimalName("Tiger");
        tiger.speed();

        Animal dog = new Dog();
        dog.setAnimalName("Dog");
        dog.speed();

        animalList.add(horse);
        animalList.add(tiger);
        animalList.add(dog);

        winner = animalList.get(0);

        for (int i = 0; i < animalList.size(); i++) {
            if(animalList.get(i).speed() > winner.speed()){
                winner = animalList.get(i);
            }
        }

        System.out.println("Winner is " + winner.getAnimalName() + " with speed: " + winner.speed());
    }
}
