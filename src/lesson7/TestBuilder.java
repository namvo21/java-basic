package lesson7;

import static lesson7.HousewithBuilder.Builder;

public class TestBuilder {
    public static void main(String[] args) {
        //HousewithBuilder.Builder builder = new HousewithBuilder.Builder();
        //HousewithBuilder house1 = builder.withColor("Blue").doorNumbers(2).build();
        //HousewithBuilder house2 = builder.withColor("White").withtopRoofColor("Red").build();

        Builder builder = new Builder();
        HousewithBuilder house1 =
                builder
                        .withColor("Blue")
                        .doorNumbers(2)
                        .build();

        System.out.println(house1.getColor());

        HousewithBuilder house2 =
                builder
                        .withColor("White")
                        .withtopRoofColor("Red")
                        .build();

    }
}
