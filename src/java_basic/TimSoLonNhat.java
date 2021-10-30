package java_basic;

public class TimSoLonNhat {
    public static void main(String[] args) {
        int [] intMyArray = {1, 2, 4, 70, 7, 8, 4, 5, 9};
        int solonnhat = intMyArray[0];

        for (int elementIndex = 0; elementIndex < intMyArray.length; elementIndex++) {
            if(intMyArray[elementIndex] > solonnhat){
                solonnhat = intMyArray[elementIndex];
            }
        }
        System.out.printf("So lon nhat trong mang la %d", solonnhat);
    }
}
