package lesson7;

import lesson6.Animal;

import java.util.ArrayList;
import java.util.List;

import static lesson7.AnimalwithBuilder.Builder;

public class TestAnimalBuilder {
    public static void main(String[] args) {
        List<AnimalwithBuilder> animalList = new ArrayList<>();
        List<AnimalwithBuilder> animalwithSpeed = new ArrayList<>();
        AnimalwithBuilder winner;

        Builder builder = new Builder();
        AnimalwithBuilder tiger =
                builder.
                        withAnimalName("Tiger").
                        withFlyable(false).
                        withSpeed(100).
                        build();

        AnimalwithBuilder dog =
                builder.
                        withAnimalName("Dog").
                        withFlyable(false).
                        withSpeed(60).
                        build();

        AnimalwithBuilder horse =
                builder.
                        withAnimalName("Horse").
                        withFlyable(false).
                        withSpeed(75).
                        build();

        AnimalwithBuilder falcon =
                builder.
                        withAnimalName("Falcon").
                        withFlyable(true).
                        withSpeed(80).
                        build();

        AnimalwithBuilder eagle =
                builder.
                        withAnimalName("Eagle").
                        withFlyable(true).
                        withSpeed(100).
                        build();

        animalList.add(tiger);
        animalList.add(dog);
        animalList.add(horse);
        animalList.add(falcon);
        animalList.add(eagle);

        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).getFlyable() == false) {
                animalwithSpeed.add(
                        builder.
                                withAnimalName(animalList.get(i).getAnimalName()).
                                withSpeed(animalList.get(i).getSpeed()).
                                build());
            }
            if (animalList.get(i).getFlyable() == true)
                System.out.println(animalList.get(i).getAnimalName() + " not allow to join the game");
        }

        winner = animalwithSpeed.get(0);

        for (int i = 0; i < animalwithSpeed.size(); i++) {
            if (animalwithSpeed.get(i).getSpeed() > winner.getSpeed())
                winner = animalwithSpeed.get(i);
        }

        System.out.println("Winner is " + winner.getAnimalName() + " with speed: " + winner.getSpeed());
    }

}
