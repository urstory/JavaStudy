/**
 * Created by EDU5 on 2015-08-28.
 */
public class Test29 {
    public static void main(String args[]){
        MyBean2 bean1 = new MyBean2("*");
        MyBean2 bean2 = new MyBean2("-");

        // 3) Runnable을 구현하고 있는 인스턴스를
        // Thread생성자에 넣어 Thread인스턴스를 만든다.
        Thread t1 = new Thread(bean1);
        Thread t2 = new Thread(bean2);
        // 4) Thread가 가지고 있는 start를 호출한다.
        // 해당 Thread가 Ruunnable을 가지고 있다면
        // 해당 Runnable의 run이 호출된다.
        t1.start();
        t2.start();


        System.out.println("end!!"); // 3개의 Thread(흐름)
    }
}

// 자바는 단일 상속만 지원한다. 이미 누군가를 상속받고 있을 때는
// Thread를 상속받을 수 없다.
// Thread를 실행하려면 start()가 사용되야 하는데,
// Runnable을 구현하면 start메소드가 없다.
class MyBean2 implements Runnable{ // 1) Runnable인터페이스를 구현
    String str;
    public MyBean2(String str){
        this.str = str;
    }
    public void run(){ // 2) run메소드를 오버라이딩
        for(int i = 0; i < 10; i++){
            System.out.print(str);
            try {
                // 0 ~ 999
                Thread.sleep((int)(Math.random() * 1000));
            }catch(Exception ex){}
        }
        System.out.println();
    }
}

