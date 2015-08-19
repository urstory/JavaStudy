/**
 * Created by EDU5 on 2015-08-18.
 */
public class CalMain {
    public static void main(String[] args){
        Cal cal = new Cal();
        cal.plus(500);
        cal.plus(300);
        cal.minus(50);
        System.out.println(cal.getValue());
        cal.clear();
        cal.minus(100);
        cal.plus(50);
        System.out.println(cal.getValue());
    }
}
