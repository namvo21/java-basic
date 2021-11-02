package java_basic;

public class SapXepMangTangDan {
    public static void main(String[] args) {
        int [] intMyArray = {1, 2, 4, 70, 7, 8, 4, 5, 9};
        int temp = intMyArray[0];

        for (int i = 0; i < intMyArray.length - 1; i++) {
            for (int j = i + 1; j < intMyArray.length; j++) {
                if (intMyArray[i] > intMyArray[j])
                {
                    temp = intMyArray[i];
                    intMyArray[i] = intMyArray[j];
                    intMyArray[j] = temp;
                }
            }
        }

        for (int i = 0; i < intMyArray.length; i++) {
            System.out.println(intMyArray[i]);
        }
    }
}
