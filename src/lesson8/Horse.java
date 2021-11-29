package lesson8;

import java.security.SecureRandom;

public class Horse extends Animal {

    public Horse(String animalName) {
        super(animalName);
    }

    @Override
    public int speed(int maxSpeed) {
        return this.speed = new SecureRandom().nextInt(maxSpeed);
    }
}
