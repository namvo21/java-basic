package lesson2;

import java.util.Scanner;

public class DrawStarDesc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number, please");
        int inputNumber = scanner.nextInt();

        for (int startNumber = inputNumber; startNumber > 0; startNumber--) {
            for (int startIndex = 1; startIndex <= startNumber ; startIndex++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
