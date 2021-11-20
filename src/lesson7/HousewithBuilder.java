package lesson7;

import java.security.SecureRandom;

public class HousewithBuilder {

    private String color = "White";
    private int mainDoors = 1;
    private String topRoofColor;

    public HousewithBuilder() {
    }

    private HousewithBuilder(Builder builder) {
        color = builder.color;
        mainDoors = builder.mainDoors;
        topRoofColor = builder.topRoofColor;
    }

    // READ ONLY
    public String getColor() {
        return color;
    }

    public int getMainDoors() {
        return mainDoors;
    }

    public String getTopRoofColor() {
        return topRoofColor;
    }


    // Customer Service | Inner class
    public static class Builder{
        private String color = "White";
        private int mainDoors = 1;
        private String topRoofColor;

        //Method chaining
        // WRITE ONLY
        public Builder withColor(String color){
            this.color = color;
            return this;
        }

        public Builder doorNumbers(int mainDoors){
            this.mainDoors = mainDoors;
            return this;
        }

        public Builder withtopRoofColor(String topRoofColor){
            this.topRoofColor = topRoofColor;
            return this;
        }

        public HousewithBuilder build(){
            return new HousewithBuilder(this);
        }
    }
}
