/**
 * Created by EDU5 on 2015-08-18.
 */
public class Cal {
    private int value = 0; // 필드(인스턴스변수)

    public void plus(int i){
        // 메소드안에 value가 선언되어 있지 않으면
        // 해당 value는 this.value를 의미한다.
        value = value + i;
    }

    public void minus(int i){
        value = value - i;
    }

    public void clear(){
        value = 0;
    }

    public int getValue(){ // getter 메소드

        return value; // 필드(인스턴스변수) value를 반환한다.
    }
}
