/**
 * Created by EDU5 on 2015-08-20.
 */
public class Test17 {
    public static void main(String args[]){
        Box171 b1 = new Box171();
        b1.setObj("hello"); // String class를 설정
        //Object boj = b1.getObj();
        String s1 = (String)b1.getObj();

    }
}

class Box171{
    private Object obj;

    public Object getObj() { // Object나 자손이 나올 수 있다.
        return obj;
    }

    public void setObj(Object obj) { // Object의 자손이 들어간다.
        this.obj = obj;
    }
}