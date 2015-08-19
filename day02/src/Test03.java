/**
 * Created by EDU5 on 2015-08-19.
 */
public class Test03 {
    public static void main(String[] args){
        int count = 9;
        char ch = 'a';
        for(int i = 1; i <= count; i++){
            for(int k = 1; k <= i; k++){
                System.out.print(ch);
                ch++;
                if(ch > 'z'){
                    ch = 'a';
                }
            } // for k
            System.out.println();
        } // for i
    } // main
}
