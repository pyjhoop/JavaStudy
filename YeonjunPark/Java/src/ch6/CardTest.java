package ch6;

public class CardTest {
	public static void main(String[] args) {
		System.out.println("Card.width = "+Card.width);
		System.out.println("Card.width = "+Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 4;
		System.out.println("c1은"+c1.kind+", "+c1.number+"이며, 크기는 ("+c1.width+", "+c1.height+")");
		System.out.println("c2은"+c2.kind+", "+c2.number+"이며, 크기는 ("+c2.width+", "+c2.height+")");
		//클래스 값 변경
		c1.height = 50;
		c1.width = 10;
		System.out.println("c1은"+c1.kind+", "+c1.number+"이며, 크기는 ("+c1.width+", "+c1.height+")");
	}
}

class Card {
	String kind;
	int number;
	static int height = 250;
	static int width = 200;
}
