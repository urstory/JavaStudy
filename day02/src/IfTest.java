/**
 * Created by EDU5 on 2015-08-19.
 */
public class IfTest {
    public static void main(String args[]){
        int i = 5;
        // i �� 3�̻� 6���Ͽ� �ش��Ѵٸ� hello�� ����Ͻÿ�.
        if(i >= 3 && i <= 6){ // and ������
            System.out.println("hello");
        }
        // i �� 5�̻� �̰ų� 2 ���� �� ��� hi �� ����Ͻÿ�
        if(i >=5 || i <= 2){ // or������.
            System.out.println("hi");
        }

        int k = 5;
        if(++k >= 4 || ++k <= 2){
            System.out.println("ok!");
        }
        System.out.println(k); // 6


        String s = "F";
        int score = 66;
        // score�� ���� s�� A, B, C, D, F �߿� �ϳ��� �����Ͻÿ�.
        if(score >= 90 && score <= 100){
            s = "A";
        }else if(score >= 80 && score <= 89){
            s = "B";
        }else if(score >= 70 && score <= 79){
            s = "C";
        }else if(score >= 60 && score <= 69){
            s = "D";
        }else if(score >= 0 && score <= 59){
            s = "F";
        }else{
            s = "Error : 0 ~ 100";
        }

        System.out.println(s);
    }
}
