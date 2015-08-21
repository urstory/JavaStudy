import java.util.Scanner;


public class Test08 {
    public static void main(String[] args){

        // Scanner 클래스는 입력을 받는 클래스
        // System.out - 화면(표준출력장치)
        // System.in - 키보드(표준입력장치)
        // System.in을 이용하는 Scanner인스턴스를 만든다.
        Scanner scan = new Scanner(System.in);
        System.out.println("문장열을 입력하세요.");
        // next()메소드에서 멈춰있다. 사용자가 문장열을 입력하고
        // 엔터를 입력할때까지......
        String line = scan.next(); // 키보드로 입력한다.
        System.out.println(line);
    }
}
