package java_basic;

public class TinhTrungBinhCong {
    public static void main(String[] args) {
        int [] intMyArray = {7, 8, 10, 70, 7, 8, 11, 5, 9};
        int total = 0;
        int trungbinhgcong;

        for (int elementIndex = 0; elementIndex < intMyArray.length; elementIndex++) {
            total = total + intMyArray[elementIndex];
        }
        trungbinhgcong = total / intMyArray.length;
        System.out.printf("Trung binh cong cua mang la %d", trungbinhgcong);
    }
}
