package java_basic;

public class TinhGiaiThua {
    public static void main(String[] args) {
        int giaithua = 1;
        int n = 3;

        for (int i = n; i > 0; i--) {
            giaithua = giaithua * i;
        }
        System.out.printf("Giai thua cua %d la %d", n, giaithua);
    }
}
