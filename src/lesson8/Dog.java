package lesson8;

import java.security.SecureRandom;

public class Dog extends Animal{

    public Dog(String animalName) {
        super(animalName);
    }

    @Override
    public int speed(int maxSpeed) {
        return this.speed = new SecureRandom().nextInt(maxSpeed);
    }
}
