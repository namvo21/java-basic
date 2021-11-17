package lesson6;

import java.security.SecureRandom;

public class Dog extends Animal{

    @Override
    public int speed() {
        int randomSpeed = new SecureRandom().nextInt(61);
        return randomSpeed;
    }
}
