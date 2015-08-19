// �ϳ��� ���Ͽ� class�� ������ ���� �� �ִ�.
// �ٸ� ���ϸ�� ���� Ŭ������ public �ؾ� �ϰ�, �ٸ� Ŭ������ public �ϸ� �ȵȴ�.
// ���� �ϳ��� ���� public �� Ŭ������ �ϳ����̴�.
public class SwapTest {
    public static void main(String args[]){
        int i = 50;
        int k = 90;
        swap(i, k);
        System.out.println(i + "," + k);

        // ���۷����� �����Ͽ� ���� �ٲ۴�.
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

// �ʵ� i�� k�� ������ �ִ� Data class
class Data{
    int i;
    int k;
}