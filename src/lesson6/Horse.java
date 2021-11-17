package lesson6;

import java.security.SecureRandom;

public class Horse extends Animal{

    @Override
    public int speed() {
        int randomSpeed = new SecureRandom().nextInt(76);
        return randomSpeed;
    }
}
