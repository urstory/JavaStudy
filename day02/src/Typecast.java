/**
 * Created by EDU5 on 2015-08-19.
 */
public class Typecast {
    public static void main(String args[]){
        byte b = 25;
        short s = b;
        int i = s;
        long l = i;
        float f = i;
        double d = f;

        byte b1 = -128;
        b1--; // b1 = b1 + 1 - b1 = -128 , b1 = 127

        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("b1 = " + b1);

        byte b2;
        int i2 = 414;
        b2 = (byte)i2;
        System.out.println(b2); // -98

        float f2 = 129.456f;
        i2 = (int)f2;
        System.out.println(i2); // 123

        b2 = (byte)f2;
        System.out.println(b2); // 123
    }
}
