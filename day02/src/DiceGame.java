/**
 * Created by EDU5 on 2015-08-18.
 */
public class DiceGame {
    public static void main(String args[]){
        MyMath math = new MyMath();
        int me = math.dice();
        int you = math.dice();
        if(me > you){
            System.out.println("me!!" + me + " ," + you);
        }else if(me < you){
            System.out.println("-_-;" + me + " ," + you);
        }else{
            System.out.println("equals" + me + " ," + you);
        }

    }
}
