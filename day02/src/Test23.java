import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Test23 {
    public static void main(String args[]){
        List<Student23> list = new ArrayList<>();
        list.add(new Student23("kim", 90));
        list.add(new Student23("kim", 40));
        list.add(new Student23("choi", 80));

        //Collections.sort(list);
        Collections.shuffle(list);

        for(int i = 0; i < list.size(); i++){
            Student23 s = list.get(i);
            System.out.println(s.name + ", " + s.score);
        }
    }
}

// Java에서 비교를 위해 제공하는 interface Comparable을 구현한다.
class Student23 implements Comparable<Student23>{
    String name;
    int score;
    public Student23(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // 이름이 같다면 점수가 낮은사람부터 높은사람으로 나오도록?
    public int compareTo(Student23 s){
        int value = this.name.compareTo(s.name);
        if(value == 0){
            return this.score - s.score;
        }else{
            return value;
        }
    }
}