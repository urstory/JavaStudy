import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by EDU5 on 2015-08-20.
 */
public class Test19 {
    public static void main(String args[]){
        // Collection : 순서도 기억못하고, 중복 허용.
        // List : 순서를 기억
        // Set : 중복을 허용하지 않는다.
        Collection<String> coll = new HashSet<>();
        coll.add("hello");
        coll.add("hello");
        coll.add("world");
        coll.add("!!!");
        // Collection으로 부터 하나씩 모두 꺼낼 수 있는
        // Iterator를 구한다.
        Iterator<String> iter = coll.iterator();
        while(iter.hasNext()){ // 꺼낼것이 있느냐?
            String str = iter.next(); // 꺼낸다.
            System.out.println(str);
        }
    } // main
}
