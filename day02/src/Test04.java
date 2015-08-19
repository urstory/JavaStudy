/**
 * Created by EDU5 on 2015-08-19.
 */
public class Test04 {
    public static void main(String[] args){
        // 100명의 학생이 있다.
        // 각각의 학생이 국어점수를 랜덤하게 부여받는다.
        // 100명의 학생이 부여받은 점수를 출력하고, 총점과 평균을 구하시오.
        // 정수배열type의 scoreArray를 선언. scoreArray는 레퍼런스type
        // scoreArray는 100개의 값을 '가지는' 정수배열을 레퍼런스 한다.
        int[] scoreArray = new int[100];
        // 모든 배열은 속성 length를 가진다. 배열의 크기를 출력한다.
        System.out.println(scoreArray.length);
        for(int i = 0; i < scoreArray.length; i++){
            // scoreArray 의 i번째 방의 값을 출력한다.
            System.out.println(scoreArray[i]);
        }
    } // main
}
