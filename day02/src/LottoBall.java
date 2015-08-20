// 번호를 가지도록 하고
// LottoBall인스턴스가 만들어질때(생성자에서)
// 번호를 초기화할 수 있도록 한다.
// getter만 만든다.
public class LottoBall {
    private int number;

    public LottoBall(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
