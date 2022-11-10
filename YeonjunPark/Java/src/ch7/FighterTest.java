package ch7;

public class FighterTest {
	public static void main(String[] args) {
		Fighter f= new Fighter();
		if(f instanceof Unit) {
			System.out.println("f는 Unit클래스 자손입니다.");
		}
		
		if(f instanceof Fighterable){
			System.out.println("f는 Fightable인터페이스를 구현했습니다.");
		}
		
		if(f instanceof Movable) 
			System.out.println("f는 Movable인터페이스를 구현헀습니다.");
		if(f instanceof Attackable)
			System.out.println("f는 Attackable인터페이스를 구현했습니다.");
		if(f instanceof Object)
			System.out.println("f는 Object클래스 자손입니다.");
	}
}

class Fighter extends Unit implements Fighterable{
	public void move(int x, int y) {
		
	}
	public void attack(Unit u) {
		
	}
}

class Unit{
	int cuurentHP;
	int x;
	int y;
}


interface Fighterable extends Movable,Attackable{}
interface Movable{public abstract void move(int x, int y);}
interface Attackable{public abstract void attack(Unit u);}
