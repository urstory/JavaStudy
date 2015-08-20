// 객체에 값을 설정하는 메소드는 setter
// 객체의 값을 외부에 반환하는 것은 getter
// 인스턴스를 만들때는 new 다음에 생성자를 사용한다.
// 생성자는 인스턴스가 만들어질때 값을 초기화 하는 목적.
// 생성자가 하나도 없으면 자동으로 생성자는 컴파일 때 만들어진다.
public class Test14 {
    public static void main(String args[]){
        Book14 b = new Book14();
        b.setTitle("홍길동전");
        System.out.println(b.getTitle());
    }
}

// 책이 제목, 가격 이라는 필드를 만들어라.
class Book14{
    // 필드는 되도록 외부에서 직접 접근하지 않도록 한다. 은닉.
    private String title;
    private int price;

    // 컴파일 할 때 자동으로 만들어진다. (생성자가 하나도 없으면)
    // 메소드와 비슷하지만 다른 점이 있다.
    // 생성자는 class이름과 같다.
    // 생성자는 리턴type이 없다. public void Book14() (X)
    public Book14(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
