/**
 * Created by EDU5 on 2015-08-20.
 */
public class Test13 {
    public static void main(String args[]){
        // static 한 것들은 인스턴스를 만들지 않고
        // class이름.필드 or class이름.메소드() 라고 사용가능.
        //int m1 = Bean13.plus1(5, 10);
        // Math.random() - api에서 Math클래스를 살펴보자.
        Bean13 b = new Bean13();
        int m1 = b.plus1(5, 10);

        int m2 = Bean13.plus2(5, 10);
    }
}
class Bean13{
    public int plus1(int i, int k){
        return i + k;
    }

    public static int plus2(int i, int k){
        return i + k;
    }
}
