package java_basic;

public class ArrayLearning {
    public static void main(String[] args) {
        int [] myIntArray = {1, 2, 4, 2, 7, 8, 4, 5, 9};
        int arrLength = myIntArray.length;

        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[arrLength - 1]);

        for (int elementIndex = 0; elementIndex < myIntArray.length; elementIndex++) {
            myIntArray[elementIndex] = myIntArray[elementIndex] * 2;
            System.out.println(myIntArray[elementIndex]);
        }
    }

}
