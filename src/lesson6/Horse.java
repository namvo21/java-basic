package lesson6;

public class Horse extends Animal{

    @Override
    public int speed() {
        if(super.speed() < 75)
            return super.speed();
        else
            return 75;
    }
}
