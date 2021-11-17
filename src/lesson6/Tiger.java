package lesson6;

public class Tiger extends Animal{

    @Override
    public int speed() {
        if(super.speed() < 100)
            return super.speed();
        else
            return 100;
    }
}
