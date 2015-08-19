/**
 * Created by EDU5 on 2015-08-19.
 */
public class Test02 {
    public static void main(String[] args){
        // char 는 문자이면서 숫자(0,양수)이다.
        // 문자는 작은따옴표를 사용하고, 문자열은 큰따옴표를 사용한다.
        // char는 2byte
        char ch = 'A';
        ch++;
        int i = ch;
        System.out.println(ch);
        System.out.println(i); // A:65
        System.out.println((int)'a'); // a:97
        // abcdefghijklmnopqrstuvwxyz
        for(char c = 'a' ; c <= 'z' ; c++){
            System.out.print(c);
        }
        System.out.println();
    }
}
