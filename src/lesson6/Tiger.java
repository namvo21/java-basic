package lesson6;

import java.security.SecureRandom;

public class Tiger extends Animal{

    @Override
    public int speed() {
        int randomSpeed = new SecureRandom().nextInt(101);
        return randomSpeed;
    }
}
