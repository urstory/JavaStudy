public class Test01 {
    public static void main(String[] args){
        int sum = 0;
        // 1) int i = 1
        // 2) i <= 100 만족하면 블럭을 실행
        // 3) i++
        // 4) 2번부터 다시 시작.
        for(int i = 1; i <= 100; i++){
            sum = sum + i;
        }
        System.out.println(sum);

        sum = 0;
        int k = 1;
        while(k <= 100){
            sum = sum + k;
            k++;
        }
        System.out.println(sum);

        sum = 0;
        int m = 1;
        do{
            sum = sum + m;
            m++;
        }while(m <= 100);
        System.out.println(sum);
        // for, while, do- while - while문과 do-while문을 이용하여 1-100 홀수의 합
    }
}
