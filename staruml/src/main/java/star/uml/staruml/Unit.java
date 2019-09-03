package star.uml.staruml;

public class Unit {
	private String name;
	public int health;
	
	public void move() {
		System.out.println("유닛이 움직인다");
	}
	public void underAttack(Charactor Charactor) {
		System.out.println("유닛이 공격받는다");
	}
}
