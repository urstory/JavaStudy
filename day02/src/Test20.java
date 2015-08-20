import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by EDU5 on 2015-08-20.
 */
public class Test20 {
    public static void main(String args[]){
        Set<String> set = new HashSet<>();
        boolean b1 = set.add("hello");
        boolean b2 = set.add("world");
        boolean b3 = set.add("hello");
        System.out.println(set.size()); // 2
        System.out.println(b1);// true
        System.out.println(b2);// true
        System.out.println(b3);// false
        // Collection의 자식 Set.
        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }
    }
}
