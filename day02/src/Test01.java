public class Test01 {

    // main - 프로그램 시작점
    // { ... } 에 선언된 변수들 : 지역변수
    // 지역변수는 메소드가 실행될 때 메모리에 만들어지고
    // 메소드가 종료되면 사라진다.
    // 변수는 항상 type이 나오고 선언된다.
    // type - 레퍼런스 type, 기본형
    public static void main(String[] args){
        int sum = 0; // 4btyte 정수 sum에 0을 대입한다.

        // for안에 선언된 i변수는 for반복문이 종료될때 메모리에서
        // 사라진다.
        // 변수의 선언; 반복조건 ; 탈출조건식
        for(int i = 1; i <= 100; i++){
            sum = sum + i;
        }
        System.out.println(sum);



        sum = 0;
        int k = 1; // 변수의 선언
        while(k <= 100){ // 반복조건
            sum = sum + k;
            k++; // 탈출조건식
        }
        System.out.println(sum);

        sum = 0;
        int m = 1;
        do{
            sum = sum + m;
            m++;
        }while(m <= 100);
        System.out.println(sum);
    }
}
