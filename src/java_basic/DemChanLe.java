package java_basic;

public class DemChanLe {
    public static void main(String[] args) {
        int [] myIntArray = {1, 2, 4, 2, 7, 8, 4, 5, 9};

        int sochan = 0;
        int sole = 0;

        // Traditional for
        for (int elementIndex = 0; elementIndex < myIntArray.length; elementIndex++) {
            if(myIntArray[elementIndex]%2==0){
                sochan++;
            }
            else{
                sole++;
            }
        }
        System.out.printf("Tong so chan trong mang la %d\n", sochan);
        System.out.printf("Tong so le trong mang la %d", sole);
    }
}
