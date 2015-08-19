/**
 * Created by EDU5 on 2015-08-19.
 */
public class SwitchTest {
    public static void main(String args[]){
        int flag = 1;
        switch(flag){ // 정수 or 문자열
            case 1 :
                System.out.println("value 1");
                break; // switch 문을 종료
            case 2 :
                System.out.println("value2");
                break;
            case 4 :
                System.out.println("value 4");
                break;
            default:
                System.out.println("default!!");
        }
    }
}

//value 4
//default!!
