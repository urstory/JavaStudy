import java.util.Scanner;

public class Test09 {
    public static void main(String[] args){
        String[][] array = new String[3][5];

        Scanner scan = new Scanner(System.in);
        // scanner를 이용하여 친구 이름 5명을 저장한 후 출력하시오.
        for(int i = 0; i < 5; i++){
            // 친구이름 5번 입력
            array[0][i] = scan.nextLine();
            array[1][i] = scan.nextLine();
            array[2][i] = scan.nextLine();
        }
        for(int i = 0; i < 5; i++){
            // 친구이름 출력
            System.out.println(array[0][i] + "," + array[1][i]);
        }
    } // mainn
}
