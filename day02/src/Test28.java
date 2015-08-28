/**
 * Created by EDU5 on 2015-08-28.
 */
public class Test28 {
    public static void main(String args[]){
        MyBean bean1 = new MyBean("*");
        MyBean bean2 = new MyBean("-");
        bean1.start(); // Thread가 가지고 있는 메소드 //3)실행start
        bean2.start();
        System.out.println("end!!"); // 3개의 Thread(흐름)
    }
}
// Thread를 상속받은 class 는 run메소드를 오버라이딩 한다.
// 실행시키고 싶은 코드를 run메소드에서 구현한다.
// Thread는 start()라는 메소드를 가지고 있는데 이 메소드는
// Thread가 실행될 준비를 하고, 자신이 가지고 있는 run메소드를 호출
class MyBean extends Thread{ // 1) Thread를 상속
    String str;
    public MyBean(String str){
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
