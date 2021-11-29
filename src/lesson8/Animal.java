package lesson8;

import java.security.SecureRandom;

public abstract class Animal {
    protected String animalName;
    protected int speed;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getSpeed() {
        return speed;
    }

    public abstract int speed(int maxSpeed);

    @Override
    public String toString() {
        return "AnimalAbstraction{" +
                "animalName='" + animalName + '\'' +
                ", speed=" + speed +
                '}';
    }
}
