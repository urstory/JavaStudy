/**
 * Created by EDU5 on 2015-08-19.
 */
public class Test02 {
    public static void main(String[] args){
        // char �� �����̸鼭 ����(0,���)�̴�.
        // ���ڴ� ��������ǥ�� ����ϰ�, ���ڿ��� ū����ǥ�� ����Ѵ�.
        // char�� 2byte
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
