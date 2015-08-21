/**
 * Created by EDU5 on 2015-08-21.
 */
public class Test24 {
    public static void main(String[] args){
        // 인터페이스가 있다면, 인터페이스 type으로 레퍼런스 변수를 선언하는 것이 좋다.
        Cal24 c = new CalImpl24();
        int value = c.plus(5,10);
        System.out.println(value);
    }
}

// interface는 메소드를 정의만 한다. 메소드에 { } 부분이 없다.
// interface가 가지고 있는 메소드는 모두 추상메소드라고. abstract method
interface Cal24{
    public int plus(int i, int j);
    public int minus(int i, int j);
}
// CalImpl24는 Cal24 인터페이스를 구현한다.
// @Override 는 Override Annotation 이라고 읽는다.
// 부모 클래스나 인터페이스가 가지고 있는 메소드를 자식이나 구현클래승에서
// 구현할 경우 적는다. 인터페이스가 plus메소드를 가지고 있는데 오타로 pluss 라고
// 적는다면 컴파일이 안된다.
class CalImpl24 implements Cal24{
    @Override
    public int plus(int i, int j) {
        return i + j;
    }

    @Override
    public int minus(int i, int j) {
        return i - j;
    }
}
