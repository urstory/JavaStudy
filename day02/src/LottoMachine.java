public class LottoMachine {
    private LottoBall[] balls;

    public void setBalls(LottoBall[] balls) {
        this.balls = balls;
    }

    public void mix(){
        for(int i = 0; i < 1000; i++){
            int index1 = (int)(Math.random() * 45); // 0<=x<=44
            int index2 = (int)(Math.random() * 45);
            if(index1 != index2){
                LottoBall tmp = balls[index1];
                balls[index1] = balls[index2];
                balls[index2] = tmp;
            }
        } // for
    } // mix

    public LottoBall[] getBalls(){
        LottoBall[] result = new LottoBall[6];
        for(int i = 0; i < 6; i++){
            result[i] = balls[i];
        }
        return result;
    }
}
