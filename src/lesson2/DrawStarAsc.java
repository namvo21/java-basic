package lesson2;

public class DrawStarAsc {
    public static void main(String[] args) {
        int inputNumber = 9;

        for (int startNumber = 1; startNumber <= inputNumber; startNumber++) {
            for (int startIndex = 1; startIndex <= startNumber ; startIndex++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
