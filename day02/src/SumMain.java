public class SumMain {
    public static void main(String[] args){
        // 1부터 100까지의 합을 구하시오.
        int sum1 = 0;
        // i는 1부터 100이하일때까지 i를 1씩 증가하시오.
        // i++  ==> i = i + 1
        for(int i = 1; i <= 100; i++){
            sum1 = sum1 + i;
        }
        System.out.println(sum1); // 5050

        int sum2 = 0;
        // i는 100부터 1이상일때까지 i를 1씩 감소하시오.
        for(int i = 100; i >=1; i--){
            sum2 = sum2 + i;
        }
        System.out.println(sum2);

        int sum3 = 0;
        // 1부터 100까지 숫자중에서 짝수만 합한 결과를 출력하시오.
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                sum3 = sum3 + i;
            }
        }
        System.out.println(sum3);
        // 99단을 출력한다.
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
