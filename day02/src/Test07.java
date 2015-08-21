/**
 * Created by EDU5 on 2015-08-19.
 */
public class Test07 {
    public static void main(String args[]){
        // 2차원 배열을 선언하고.
        // array ---> _,_
        //            | +---> _,_,_
        //            +-----> _,_,_
        int[][] array = new int[2][3];
        System.out.println(array.length);
        System.out.println(array[0].length);
        System.out.println(array[1].length);

        int[][] array2 = new int[][]{ {2,3},{1,2,3} };
        System.out.println(array2.length);
        System.out.println(array2[0].length);
        System.out.println(array2[1].length);

        for(int i = 0; i < array2.length; i++){
            for(int k = 0; k < array2[i].length; k++){
                System.out.print(array2[i][k] + "   ");
            }
            System.out.println();
        }
    }
}
