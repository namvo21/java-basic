package lesson8;

import java.security.SecureRandom;

public class Tiger extends Animal {

    public Tiger(String animalName) {
        super(animalName);
    }

    @Override
    public int speed(int maxSpeed) {
        return this.speed = new SecureRandom().nextInt(maxSpeed);
    }

}
