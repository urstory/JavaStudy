public class Test27 {
    public static void main(String args[]){
    }
}


class ActivityFactory{
    // Activity가 리턴된다는 것은 Activity or Activity의 후손이 리턴되는 것을
    // 의미한다. 그런데 Activity클래스는 추상 class이기 때문에 인스턴스가 될 수
    // 없다. 즉, 아래의 메소드는 Activity의 후손이 리턴된다라는 것을 의미한다.
    public static Activity create(String cmd){
        Activity a = null;
        if(cmd.equals("main")){ // cmd와 "main"이 같을 경우
            a = new MainActivity();
        }
        return a;
    }
}

class MainActivity extends Activity{

}

// 추상 class - 인스턴스를 만들 수 없다.
abstract class Activity{
    public void onCreate(){
        System.out.println("onCreate");
    }
    public void onStart(){
        System.out.println("onStart");
    }

    public void onResume(){
        System.out.println("onResume");
    }

    public void onPause(){
        System.out.println("onPause");
    }

    public void onStop(){
        System.out.println("onStop");
    }

    public void onDestroy(){
        System.out.println("onDestroy");
    }
}