/**
 * Created by EDU5 on 2015-08-18.
 */
public class Cal {
    private int value = 0; // �ʵ�(�ν��Ͻ�����)

    public void plus(int i){
        // �޼ҵ�ȿ� value�� ����Ǿ� ���� ������
        // �ش� value�� this.value�� �ǹ��Ѵ�.
        value = value + i;
    }

    public void minus(int i){
        value = value - i;
    }

    public void clear(){
        value = 0;
    }

    public int getValue(){ // getter �޼ҵ�

        return value; // �ʵ�(�ν��Ͻ�����) value�� ��ȯ�Ѵ�.
    }
}
