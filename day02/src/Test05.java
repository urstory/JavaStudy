/**
 * Created by EDU5 on 2015-08-19.
 */
public class Test05 {
    public static void main(String[] args){
        // �迭�� �����԰� ���ÿ� �ʱ�ȭ
        int[] array = new int[]{ 5, 10, 4, 6, 7};
        System.out.println(array.length);
        // array�� ������ �����Ͽ� ����Ϸ���?

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
