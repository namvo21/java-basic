package lesson7;

public class House {

    private String color = "White";
    private int mainDoors = 1;
    private String topRoofColor;

    public House(String color) {
        this.color = color;
    }

    public House(int mainDoors) {
        this.mainDoors = mainDoors;
    }

    public House(String color, String topRoofColor) {
        this.color = color;
        this.topRoofColor = topRoofColor;
    }

    public House(String color, int mainDoors, String topRoofColor) {
        if(color != null)
            this.color = color;
        if(mainDoors > 0)
            this.mainDoors = mainDoors;
        if(topRoofColor != null)
            this.topRoofColor = topRoofColor;
    }

    public static void main(String[] args) {
        House house = new House(null, 2, "Blue");
        House house1 = new House("Blue", 0, null);
    }
}
