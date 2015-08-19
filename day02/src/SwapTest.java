// 하나의 파일에 class는 여러개 있을 수 있다.
// 다만 파일명과 같은 클래스는 public 해야 하고, 다른 클래스는 public 하면 안된다.
// 파일 하나에 오직 public 한 클래스는 하나뿐이다.
public class SwapTest {
    public static void main(String args[]){
        int i = 50;
        int k = 90;
        swap(i, k);
        System.out.println(i + "," + k);

        // 레퍼런스를 전달하여 값을 바꾼다.
        Data d = new Data();
        d.i = 50;
        d.k = 90;
        swap(d);
        System.out.println(d.i + " , " + d.k);
    }

    public static void swap(Data d){
        int tmp = d.i;
        d.i = d.k;
        d.k = tmp;
    }

    public static void swap(int i, int k){
        int tmp = i;
        i = k;
        k = tmp;
    }
}

// 필드 i와 k를 가지고 있는 Data class
class Data{
    int i;
    int k;
}