/**
 * Created by EDU5 on 2015-08-18.
 */
public class MyMath {
    public int abs(int i){
        // i�� ������ ����� �ٲ۴�. ���ǹ��� ���Ǿ�� �Ѵ�. if
        if(i < 0){
            i = i * -1;
        }
        return i;
    } // abs

    // i�� j�߿� ū ���� ��ȯ�Ѵ�. ������ �ƹ��ų� ��ȯ�Ѵ�.
    public int max(int i, int j){
        if(i > j){
            return i;
        }
        return j;
    }

    // ¦���� true, Ȧ���� false�� ��ȯ�ϴ� �޼ҵ带 ����ÿ�
    public boolean isEven(int value){
        if(value % 2 == 0){ // % : ������ ������ , == ������?, != �ٸ���?
            return true;
        }else{
            return false;
        }
    }

    // 1~6 ������ ������ ���� ��ȯ�Ѵ�. ���ֻ��Ǵ� �ڵ�. �� �˾Ƶ���.
    public int dice(){
        int diceValue = (int)(Math.random() * 6) + 1;
        return diceValue;
    }
//    int diceValue = math.dice();
//    System.out.println(diceValue);
    // 0 ~ 100 ������ ������ ���� ��ȯ�ϴ� score()��� �޼ҵ带 ���弼��.
    public int price(){
        // Math.random() * 101 : 0.0 <= x < 101.0
        //     ������ ��ȯ      : 0 <= x <= 100
        int score = (int)(Math.random() * 101);
        return score;
    }
} // MyMath
