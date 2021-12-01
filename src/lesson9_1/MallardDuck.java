package lesson9_1;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void disableFlyAbility(){
        flyBehavior = new FlyNoWay();
    }
}
