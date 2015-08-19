/**
 * Created by EDU5 on 2015-08-19.
 */
public class IfTest {
    public static void main(String args[]){
        int i = 5;
        // i 가 3이상 6이하에 해당한다면 hello를 출력하시오.
        if(i >= 3 && i <= 6){ // and 연산자
            System.out.println("hello");
        }
        // i 가 5이상 이거나 2 이하 일 경우 hi 를 출력하시오
        if(i >=5 || i <= 2){ // or연산자.
            System.out.println("hi");
        }

        int k = 5;
        if(++k >= 4 || ++k <= 2){
            System.out.println("ok!");
        }
        System.out.println(k); // 6


        String s = "F";
        int score = 66;
        // score에 따라서 s를 A, B, C, D, F 중에 하나로 변경하시오.
        if(score >= 90 && score <= 100){
            s = "A";
        }else if(score >= 80 && score <= 89){
            s = "B";
        }else if(score >= 70 && score <= 79){
            s = "C";
        }else if(score >= 60 && score <= 69){
            s = "D";
        }else if(score >= 0 && score <= 59){
            s = "F";
        }else{
            s = "Error : 0 ~ 100";
        }

        System.out.println(s);
    }
}
