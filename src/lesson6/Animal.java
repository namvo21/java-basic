package lesson6;

import java.security.SecureRandom;

public class Animal {
    private String animalName;

    public Animal() {
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int speed(){
        int randomSpeed = new SecureRandom().nextInt(101);
        return randomSpeed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                '}';
    }
}
