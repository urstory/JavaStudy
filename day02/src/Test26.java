/**
 * Created by EDU5 on 2015-08-21.
 */
public class Test26 {
    public static void main(String[] args){
        Action a = new MyAction();
        a.exec();
    }
}
class Action{
    public void init(){
        System.out.println("init");
    }
    public void exec(){
        init(); // 자기 자신의 메소드를 호출할 때는 변수명. 이라는 것이 안붙는다.
                // this. 생략된 것이다.
        System.out.println("exec");
    }
}
class MyAction extends Action{
    @Override
    public void init() {
        System.out.println("myAction init!!");
    }
}