package lesson3;

import java.util.Scanner;

public class CovertStringToTime {
    public static void main(String[] args) {
        String myString = "3hrs and 50 minutes";
        String [] splitStr = myString.split(" and ");

        String hourStr = splitStr[0];
        String minStr = splitStr[1];

        long hours = Long.parseLong(hourStr.replaceAll("[^0-9]", ""));
        long minutes = Long.parseLong(minStr.replaceAll("[^0-9]", ""));

        long totalMinutes = (hours * 60) + minutes;
        System.out.printf("Total minutes: %d %s", totalMinutes , "minutes");
    }
}
