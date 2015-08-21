public class Test02 {
    public static void main(String[] args){
        // char는 기본형. 2byte 0,양수
        // 문자는 '값'  문자열(String) "값"
        char ch = 'A';
        ch++; // ch는 'B' 가 된다.
        int i = ch; // ch가 몇번째 문자인지 i에 설정함.
        System.out.println(ch);
        System.out.println(i); // A:65  B:66
        System.out.println((int)'a'); // a:97
        for(char c = 'a' ; c <= 'z' ; c++){
            System.out.print(c); // abc ... xyz
        }
        System.out.println();
    }
}
