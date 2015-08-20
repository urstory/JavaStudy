import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGame {
    public static void main(String[] args){
        // 카드를 52장만든다.
        List<Card> cardList = CardFactory.createCardList();
        // 카드를 섞는다.
        Collections.shuffle(cardList);

        // Player 3명을 만든다.
        Player[] players = new Player[3];
        String[] names = new String[]{"홍길동","둘리", "도우너"};
        for(int i = 0; i < 3; i++){
            players[i] = new Player(names[i]);
        }


        // 카드를 나눠주기
        int m = 0;
        for(int i = 0; i < 5; i++){ // 5번
            for(int k = 0; k < players.length; k++){ // 3명의 플레이어에게
                Card c = cardList.get(m); // 카드를 하나씩 꺼내서
                m++;
                players[k].addCard(c); // 나눠준다.
            }
        }

        // 플레이어들에게 카드의 전체 수의 합을 달라고 하여 출력
        for(int k = 0; k < players.length; k++){
            System.out.println(players[k].getCardCount());
        }
    } // main


}

class CardFactory{
    public static List<Card> createCardList() {
        List<Card> cardList;//문자열 배열을 선언과 동시에 초기화
        String[] patternArray = new String[]{"♠","♣","◈","♥"};
        cardList = new ArrayList<>();
        for(int i =0; i < patternArray.length; i++){ //4
            for(int k = 1; k <= 13; k++){
                Card c = new Card(patternArray[i], k);
                cardList.add(c);
            }
        } // for
        return cardList;
    }
}

class Card{
    private String pattern; // 문양
    private int number; // 숫자

    public Card(String pattern, int number) {
        this.pattern = pattern;
        this.number = number;
    }

    public String getPattern() {
        return pattern;
    }

    public int getNumber() {
        return number;
    }
}

class Player{
    private String name;  // null
    private List<Card> cardList; // null

    // 이름과 cardList를 초기화
    public Player(String name){
        this.name = name;
        cardList = new ArrayList<Card>(); // card를 저장할 수 있는 텅빈 List
    }

    public String getName() {
        return name;
    }

    public void addCard(Card card){
        cardList.add(card);
    }

    public int getCardCount(){
        int total = 0;
        for(int i = 0; i < cardList.size(); i++){
            total = total + cardList.get(i).getNumber();
        }
        return total;
    }
}
