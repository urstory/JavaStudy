/**
 * Created by EDU5 on 2015-08-19.
 */
public class EqualsTest {
    public static void main(String args[]){
        int i1 = 5;
        int i2 = 5;
        int i3 = i2; // copy
        if(i1 == i2){ // 가지고 있는 값을 비교
            System.out.println("i1 == i2");
        }
        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = s2; // s2가 레퍼런스하는 것을 s3도 레퍼런스한다.
        if(s1 == s2){ // 같은 레퍼런스이냐?
            System.out.println("s2 == s3");
        }
        if(s1.equals(s2)){ // s1과 s2가 같은 값이냐?
            System.out.println("s1 equals s2"); // s1 equals s2
        }
    }
}
