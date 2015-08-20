/**
 * Created by EDU5 on 2015-08-20.
 */
public class Test15 {
    public static void main(String args[]){
        User15 u1 = new User15("홍길동");
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
