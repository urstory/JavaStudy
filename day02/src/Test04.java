/**
 * Created by EDU5 on 2015-08-19.
 */
public class Test04 {
    public static void main(String[] args){
        // 100���� �л��� �ִ�.
        // ������ �л��� ���������� �����ϰ� �ο��޴´�.
        // 100���� �л��� �ο����� ������ ����ϰ�, ������ ����� ���Ͻÿ�.
        // �����迭type�� scoreArray�� ����. scoreArray�� ���۷���type
        // scoreArray�� 100���� ���� '������' �����迭�� ���۷��� �Ѵ�.
        int[] scoreArray = new int[100];
        // ��� �迭�� �Ӽ� length�� ������. �迭�� ũ�⸦ ����Ѵ�.
        System.out.println(scoreArray.length);
        for(int i = 0; i < scoreArray.length; i++){
            // scoreArray �� i��° ���� ���� ����Ѵ�.
            System.out.println(scoreArray[i]);
        }
    } // main
}
