public class Test04 {
    public static void main(String[] args){
        // 정수를 100개 저장할 수 있는 배열.
        // 변수가 100개 있는것과 같은 의미
        // i0 i1 i2 i3 .... i99
        // i[0]  i[1]  i[2] ... i[99]
        int[] scoreArray = new int[100];
        // 배열의 길이. 배열은 모두 length라는 필드를 가진다.
        System.out.println(scoreArray.length);
        for(int i = 0; i < scoreArray.length; i++){
            // 배열에 0~100 사이의 값을 설정
            scoreArray[i] = (int)(Math.random() * 101);
        }
        int total = 0;
        for(int i = 0; i < scoreArray.length; i++){
            // 배열의 모든 값 출력
            System.out.println(scoreArray[i]);
            total = total + scoreArray[i];
        }
        System.out.println(total + " , "
                + (total / (double)scoreArray.length));
    } // main
}
