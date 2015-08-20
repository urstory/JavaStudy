import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test21 {
    public static void main(String args[]){
        Map<String, String> map = new HashMap<>();
        map.put("s1", "kim");
        map.put("s2", "lee");
        map.put("s3", "kang");
        String value1 = map.get("s1"); // key를 이용하여 value를 꺼낸다.
        String value2 = map.get("s3");
        System.out.println(value1);
        System.out.println(value2);

        // Map에 있는 모든 key와 value를 출력하시오?
        // key들만 모아놓으면 Set이된다.
        Set<String> keyset = map.keySet();
        Iterator<String> iter = keyset.iterator();
        while(iter.hasNext()){
            String key = iter.next();
            String value = map.get(key);
            System.out.println(key + " : " + value);
        }
    } // main
}
//        s3 : kang
//        s1 : kim
//        s2 : lee