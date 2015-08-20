
public class Test11 {
    public static void main(String args[]){
        System.out.println("Hello");
        System.out.println("Hello");
    }
}

// static 에 대하여 알아보자.
// main메소드 - 프로그램 시작점. (자바만든 사람이 정한것!)
// 모든 class는 사용하려면 메모리에 올라가야 한다. (인스턴스가 되야한다.)
// 인스턴스가 되려면 new 라는 연산자가 사용됭야 한다.
// class를 사용한다는 것은 필드, 메소드를 이용한다는 뜻.

// static이 붙은 필드와 메소드는 클래스변수 그리고 클래스메소드라고 한다.
// static이 붙은 것은 메모리에 미리 올라간다. 딱 한번 올라간다.

// main메소드는 미리 메모리에 올라가고 실행된 준비가 된다.
// JVM은 main메소드를 한줄 한줄 실행해 나간다.

// JVM 이 System.out.println("Hello"); 를 실행할 때 System이
// 가지고 있는 static한 것들은 실행할 수 있도록 미리 메모리에 올린다.
// System이 가지고 있는 필드 out은 static하다. 즉 out자체가 메모리에
// 사용가능하도록 올라간다.
// System이 가지고 있는 out. out이 가지고 있는 println을 사용할 수 있다.
