package ch7;

public class DeckTest {
	public static void main(String[] args) {
		
	}
}

class Deck{
	final int CARD_NUM = 52;
	Card cardArr[] = new Card[CARD_NUM];
	
	Deck() {
		int i = 0;
		for(int k = Card.KIND_MAX; k>0;k--) {
			for(int n = 0; n<Card.NUM_MAX; n++) {
				cardArr[i++] = new Card(l.n+1);
			}
		}
	}
	
	Card pick(int index) {
		return cardArr[index];
	}
	Card pick() {
		int
	}
}

class Card{
	
}
