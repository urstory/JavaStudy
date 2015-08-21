/**
 * Created by EDU5 on 2015-08-20.
 */
public class Test15 {
    public static void main(String args[]){
        String str1 = new String("홍길동");
        char[] array = new char[]{'홍','길','동'};
        String str2 = new String(array);
        System.out.println(str2);
        User15 u1 = new User15("홍길동", 1990);
        System.out.println(u1.getName());
    }
}

// name, birthYear (정수), id, passwd
// User15의 인스턴스가 만들어질때 이름을 설정하고, 이름은
// 수정할 수 없도록 한다.
// 1) setName 메소드는 삭제 - 이름을 설정할 수 없다!!!
class User15{
    private String name;
    private int birthYear;
    private String passwd;

    // 2) String을 받아들이는 생성자를 만든다.
    // 생성자를 정의하였기 때문에 기본생성자는 자동으로 만들어지지 않는다.
    public User15(String name){
        this.name = name;
    }

    // 생성자는 여러개 만들 수 있다. 생성자 오버로딩이라고 한다.
    // 다만 파라미터의 수가 다르거나 파라미터의 type이 달라야 한다.
    // User15(String name), User15(int birthYear)
    // User15(String passwd)
    // User15(String name, String passwd)
    public User15(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
