/**
 * Created by EDU5 on 2015-08-20.
 */
public class LottoMain {
    public static void main(String args[]){
        // LottoBall 45개를 준비
        LottoBall[] balls = new LottoBall[45];
        for(int i = 0; i < 45; i++){
            balls[i] = new LottoBall(i+1);
        }

        // LottoMachine을 만든다.
        LottoMachine lm = new LottoMachine();
        // LottoMachine에 위에서 만든 45개의 볼을 설정
        lm.setBalls(balls);
        // LottoMachine이 가지고 있는 볼드를 섞는다.
        lm.mix();
        // LottoMachine에서 볼을 6개 꺼낸다.
        LottoBall[] result = lm.getBalls();
        // 출력
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i].getNumber());
        }
    } // main
}
