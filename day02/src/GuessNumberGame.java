import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String args[]){
        // Math.random() : 0.0 <= x < 1.0
        //   * 100       : 0.0 <= x < 100.0
        //   (int)       : 0 <= x < 100
        //    + 1        : 1 <= x <= 100
        int value = (int)(Math.random() * 100) + 1;
        Scanner scan = new Scanner(System.in);
        int count = 1;
        while(true){ // 무한루프.
            int guessNumber = scan.nextInt();
            if(value > guessNumber){
                System.out.println("High");
            }else if(value < guessNumber){
                System.out.println("Low");
            }else{
                System.out.println(count + " : OK!!!");
                break; // while 빠져나간다.
            }
            count++;
        }
    } // main
}
