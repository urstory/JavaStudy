/**
 * Created by EDU5 on 2015-08-20.
 */
public class Test12 {
    public static void main(String args[]){
        // 아래줄을 JVM이 실행할 때 먼저 Bean12가 가지고 있는
        // static한 것들은 모두 메모리에 올린다.
        // 그리고 나서 new로 인스턴스가 만들어진다.
        Bean12 b1 = new Bean12();
        Bean12 b2 = new Bean12();
        b1.k++;
        b1.m++;
        b2.k++;
        b2.m++;
        System.out.println(b1.k + "," + b1.m); // 2,1
        System.out.println(b2.k + "," + b2.m); // 2,1
    }
}

class Bean12{
    static int k = 0; // static변수, class변수, static 필드
    int m = 0; // 인스턴스 변수, 필드
}
