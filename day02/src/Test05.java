/**
 * Created by EDU5 on 2015-08-19.
 */
public class Test05 {
    public static void main(String[] args){
        // 배열을 선언함과 동시에 초기화
        int[] array = new int[]{ 5, 10, 4, 6, 7};
        System.out.println(array.length);
        // array의 내용을 정렬하여 출력하려면?

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
        System.out.println("------------------------");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
