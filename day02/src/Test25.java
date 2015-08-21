
public class Test25 {
    public static void main(String[] args){
        Bus25 b1 = new Bus25();
        b1.run();
        b1.infoSound();
        // 레퍼런스 type이 부모type이다.
        Car25 c1 = new Bus25();
        c1.run();
        // c1.infoSound();  // 오류가 발생한다.

        SuperCar c2 = new SuperCar();
        c2.run();

        Car25 c3 = new SuperCar();
        c3.run();
    }
}
class Car25{
    public void run(){
        System.out.println("전륜구동한다.");
    }
}
// Car25를 상속받는 Bus25
class Bus25 extends Car25{
    public void infoSound(){
        System.out.println("안내방송하다.");
    }
}

// Car25를 상속받고 있는 SuperCar!!
class SuperCar extends Car25{

}
