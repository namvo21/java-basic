package lesson6;

import java.security.SecureRandom;
import java.util.Random;

public class Animal {
    private String animalName;
    private int speed;

    public Animal() {
    }

    public Animal(String animalName, int maxSpeed) {
        this.animalName = animalName;
        this.speed = new SecureRandom().nextInt(maxSpeed);
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getSpeed(){
        return speed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", speed=" + speed +
                '}';
    }
}
