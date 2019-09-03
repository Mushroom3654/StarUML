package star.uml.staruml;

public class Medic extends Unit{
	Medic(){
		super();
	}
	public void move() {
		System.out.println("메딕이 움직인다");
	}
	public void underAttack(Charactor Charactor) {
		System.out.println("메딕이 공격받는다");
	}
	public void Healing(Charactor Charactor) {
		System.out.println("메딕이 힐한다");
	}
}
