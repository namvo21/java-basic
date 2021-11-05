package lesson3;

import java.util.Scanner;

public class ExtractNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your string");

        String myString = scanner.next();
        char [] myChar = myString.toCharArray();

        for (char c : myChar) {
            if(Character.isDigit(c))
                System.out.printf(c + "");
        }
    }
}
