/**
 * Created by EDU5 on 2015-08-19.
 */
public class EqualsTest {
    public static void main(String args[]){
        int i1 = 5;
        int i2 = 5;
        int i3 = i2; // copy
        if(i1 == i2){ // ������ �ִ� ���� ��
            System.out.println("i1 == i2");
        }
        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = s2; // s2�� ���۷����ϴ� ���� s3�� ���۷����Ѵ�.
        if(s1 == s2){ // ���� ���۷����̳�?
            System.out.println("s2 == s3");
        }
        if(s1.equals(s2)){ // s1�� s2�� ���� ���̳�?
            System.out.println("s1 equals s2"); // s1 equals s2
        }
    }
}
