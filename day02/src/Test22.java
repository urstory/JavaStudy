import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by EDU5 on 2015-08-20.
 */
public class Test22 {
    public static void main(String args[]){
        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("kang");
        list.add("kia");
        list.add("abc");

        Collections.sort(list);// List를 정렬.

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}

