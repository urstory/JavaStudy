public class SumMain {
    public static void main(String[] args){
        // 1���� 100������ ���� ���Ͻÿ�.
        int sum1 = 0;
        // i�� 1���� 100�����϶����� i�� 1�� �����Ͻÿ�.
        // i++  ==> i = i + 1
        for(int i = 1; i <= 100; i++){
            sum1 = sum1 + i;
        }
        System.out.println(sum1); // 5050

        int sum2 = 0;
        // i�� 100���� 1�̻��϶����� i�� 1�� �����Ͻÿ�.
        for(int i = 100; i >=1; i--){
            sum2 = sum2 + i;
        }
        System.out.println(sum2);

        int sum3 = 0;
        // 1���� 100���� �����߿��� ¦���� ���� ����� ����Ͻÿ�.
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                sum3 = sum3 + i;
            }
        }
        System.out.println(sum3);
        // 99���� ����Ѵ�.
        for(int k = 2; k <= 9; k++) {
            for (int i = 1; i <= 9; i++) {
                int value1 = k * i;
                System.out.println(k + " * " + i + " = " + value1);
            }
        }
//        *
//        **
//        ***
//        ****
//        *****
        for(int k = 5; k >=1; k--) {
            for (int i = 1; i <= k; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    } // main
}
