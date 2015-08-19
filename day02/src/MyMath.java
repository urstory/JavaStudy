/**
 * Created by EDU5 on 2015-08-18.
 */
public class MyMath {
    public int abs(int i){
        // i가 음수면 양수로 바꾼다. 조건문이 사용되어야 한다. if
        if(i < 0){
            i = i * -1;
        }
        return i;
    } // abs

    // i와 j중에 큰 값을 반환한다. 같으면 아무거나 반환한다.
    public int max(int i, int j){
        if(i > j){
            return i;
        }
        return j;
    }

    // 짝수면 true, 홀수면 false를 반환하는 메소드를 만드시오
    public boolean isEven(int value){
        if(value % 2 == 0){ // % : 나머지 연산자 , == 같으냐?, != 다르냐?
            return true;
        }else{
            return false;
        }
    }

    // 1~6 사이의 랜덤한 값을 반환한다. 자주사용되는 코드. 꼭 알아두자.
    public int dice(){
        int diceValue = (int)(Math.random() * 6) + 1;
        return diceValue;
    }
//    int diceValue = math.dice();
//    System.out.println(diceValue);
    // 0 ~ 100 사이의 랜덤한 값을 반환하는 score()라는 메소드를 만드세요.
    public int price(){
        // Math.random() * 101 : 0.0 <= x < 101.0
        //     정수로 변환      : 0 <= x <= 100
        int score = (int)(Math.random() * 101);
        return score;
    }
} // MyMath
