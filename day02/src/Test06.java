/**
 * Created by EDU5 on 2015-08-19.
 */
public class Test06 {
    public static void main(String args[]){
        //int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] array = new int[45];
        for(int i = 0; i < array.length; i++){
            array[i] = i+1;
        }

        // 배열을 섞는다. 2개의 랜덤한 위치를 찾아서 10,000 번
        // 배열의 값을 바꾼다.
        for(int i = 0; i< 10000; i++){
            int index1 = (int)(Math.random() * array.length);
            int index2 = (int)(Math.random() * array.length);
            if(index1 != index2){
                int tmp = array[index1];
                array[index1] = array[index2];
                array[index2] = tmp;
            }
        } // for

        for(int i = 0; i < 6; i++){
            System.out.println(array[i]);
        }
    }
}
