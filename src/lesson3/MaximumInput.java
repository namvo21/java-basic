package lesson3;

import java.util.Scanner;

public class MaximumInput {
    public static void main(String[] args) {
        final String myPassword = "password123";
        final int maximumTime = 3;
        int inputTime = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your password");
            String myInput = scanner.next();

            if(myInput.equals(myPassword)){
                System.out.println("Password is correct");
                break;
            }
            else
            {
                System.out.println("Password is not correct. Please input again");
                inputTime++;
            }
        }while (inputTime < maximumTime);

        System.out.println("Account is locked");
    }
}
