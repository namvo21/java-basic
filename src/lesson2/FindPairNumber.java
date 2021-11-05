package lesson2;

import java.util.Scanner;

public class FindPairNumber {
    public static void main(String[] args)
    {
        int[] intMyArray = {1, 2, 4, 6, 7, 8, 4, 5, 9};
        boolean isNotFound = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number, please");
        int inputNumber = scanner.nextInt();

        for (int i = 0; i < intMyArray.length - 1; i++)
        {
            for (int j = i + 1; j < intMyArray.length; j++)
            {
                if (intMyArray[i] + intMyArray[j] == inputNumber)
                {
                    System.out.printf("(%d , %d)\n", i, j);
                    isNotFound = false;
                }
            }
        }

        if (isNotFound == true) {
            System.out.println("Khong tim thay gia tri!!!");
        }
    }
}
