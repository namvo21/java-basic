package lesson7;

import java.security.SecureRandom;

public class AnimalwithBuilder {
    private String animalName;
    private boolean flyable;
    private int speed;

    public AnimalwithBuilder() {
    }

    private AnimalwithBuilder(Builder builder){
        animalName = builder.animalName;
        flyable = builder.flyable;;
        speed = builder.speed;
    }

    public String getAnimalName(){
        return animalName;
    }

    public boolean getFlyable(){
        return flyable;
    }

    public int getSpeed(){
        return speed;
    }

    public static class Builder{
        private String animalName;
        private boolean flyable = true;
        private int speed;

        public Builder withAnimalName(String animalName){
            this.animalName = animalName;
            return this;
        }

        public Builder withFlyable(boolean flyable){
            this.flyable = flyable;
            return this;
        }

        public Builder withSpeed(){
            speed = new SecureRandom().nextInt(150);
            this.speed = speed;
            return this;
        }

        public AnimalwithBuilder build(){
            return new AnimalwithBuilder(this);
        }
    }
}
