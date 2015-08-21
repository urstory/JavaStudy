import java.util.Arrays;

/**
 * Created by EDU5 on 2015-08-19.
 */
public class Test05 {
    public static void main(String[] args){
        // 배열을 선언과 동시에 초기화
        //int[] array = new int[]{ 5, 10, 4, 6, 7};
        int[] array = { 4, 5, 6, 7, 10};
        System.out.println(array.length);
        // array안의 내용을 정렬하라.
        // 아래는 비교하는 순서?
        // 0 - 1,2,3,4
        // 1 - 2,3,4
        // 2 - 3,4
        // 3 - 4
        for(int i = 0; i < array.length -1; i++){
            for(int k = i+1; k < array.length; k++){
                if(array[i] > array[k]){
                    int tmp = array[i];
                    array[i] = array[k];
                    array[k] = tmp;
                }
            }
        }
        // 자바가 기본으로 제공하는 Arrays클래스의
        // static메소드 sort를 이용하면 정렬할 수 있다.
        //Arrays.sort(array);
        System.out.println("------------------------");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
