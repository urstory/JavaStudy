import java.util.Scanner;

public class Test10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Friend[] array = new Friend[5]; // Friend를 5개 가리킬수 있는 배열.
        for(int i = 0; i < array.length; i++){
            array[i] = new Friend();
            array[i].name = scan.nextLine();
            array[i].bloodType = scan.nextLine();
            array[i].birthYear = scan.nextLine();
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i].name + "," +array[i].bloodType);
        }
    } // main
}

//응집도 : 관련된 것을 가지게 만든다!! class의 특징.
class Friend{
    String name;
    String bloodType;
    String birthYear;
}
