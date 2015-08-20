public class Test18 {
    public static void main(String args[]){
        Box181<String> b = new Box181<>();
        b.setE("hello");
        String str = b.getE();
    }
}
// Generic을 사용.
class Box181<E>{
    E e;
    public E getE() {
        return e;
    }
    public void setE(E e) {
        this.e = e;
    }
}
