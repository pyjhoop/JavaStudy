package ch7;

public class RepairableTest {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		Marin marine = new Marin();
		SCV scv = new SCV();
		scv.repair(tank);
		scv.repair(dropship);
	}
}

interface Repairable{};

class Unit1{
	int hitPoint;
	final int MAX_HP;
	Unit1(int hp){
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit1{
	GroundUnit(int hp){
		super(hp);
	}
}

class AirUnit extends Unit1{
	AirUnit(int hp){
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable{
	Tank(){
		super(150);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable{
	Dropship(){
		super(125);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "Dropship";
	}
}

class Marin extends GroundUnit{
	Marin(){
		super(40);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "Marin";
	}
	
}

class SCV extends GroundUnit implements Repairable{
	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}
//	void repair(Dropship d) {
//		Unit1 u = d;
//		while(u.hitPoint !=u.MAX_HP){
//		u.hitPoint++;	
//		}
//		System.out.println(u.toString()+"의 수리가 끝났습니다.");
//	}
//	void repair(Tank t) {
//		Unit1 u = t;
//		while(u.hitPoint !=u.MAX_HP){
//		u.hitPoint++;	
//		}
//		System.out.println(u.toString()+"의 수리가 끝났습니다.");
//	}
	
	void repair(Repairable r) {
		if(r instanceof Unit1) {
			Unit1 u = (Unit1)r; //r의 멤버가 없기에 Unit1으로 형변환해서 사용 하기전에 형변환이 가능한지 instanceof로 확인부터함.
			while(u.hitPoint !=MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString()+"의 수리가 끝났습니다.");
			
		}
	}
	
}