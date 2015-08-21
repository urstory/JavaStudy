// 우리도 package를 만들 수 있다.
// package이름은 보통 도메인 이름을 거꾸로 적는다.
// 회사 도메인 ex> sunnyvale.co.kr
// package 이름의 시작 > kr.co.sunnyvale
// 그 뒤에는 보통 프로젝트 이름이 붙는다.
// kr.co.sunnyvale.goclass
// kr.co.sunnyvale.javastudy
// 그럼 왜 이렇게 이름을 정하느냐?


// 가장 기본적인 class ( System, String, Math ... )은 java.lang
// 패키징에 있다. java.lang은 가장 기본이 되는 package
// java.lang을 제외하고는 다른 package에 있는 class는 사용하려면
// 모두 import를 해야한다.
// 컴파일러와 JVM에게 해당 class의 위치를 알려주는 것.

// java.util패키지는 프로그래밍시 유용한 클래스
// 날짜, 자료구조 등
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Test16 {
    public static void main(String args[]){
//        ArrayList list1 = new ArrayList();
//        list1.add("hello");
//        String str1 = (String)list1.get(0);

        //ArrayList<String> list = new ArrayList<>();
        //Vector<String> list = new Vector<>();
        //LinkedList<String> list = new LinkedList<>();
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("!!!");

        for(int i = 0; i < list.size(); i++){
            String str = list.get(i);
            System.out.println(str);
        }
    } // main
}
