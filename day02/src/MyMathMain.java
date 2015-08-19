/**
 * Created by EDU5 on 2015-08-18.
 * MyMath를 사용하는 class
 */
public class MyMathMain {
    public static void main(String args[]){
        MyMath math = new MyMath();
        int k = 500;
        int value = math.abs(k);
        System.out.println(value);

        int m1 = 50;
        int m2 = 60;
        int m3 = math.max(m1, m2);
        System.out.println(m3);

        int value50 = 51;
        boolean flag1 = math.isEven(value50);
        System.out.println(flag1);

        int diceValue = math.dice();
        System.out.println(diceValue);
    }
}
