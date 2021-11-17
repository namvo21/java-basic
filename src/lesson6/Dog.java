package lesson6;

public class Dog extends Animal{

    @Override
    public int speed() {
        if(super.speed() < 60)
            return super.speed();
        else
            return 60;
    }
}
