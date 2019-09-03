package strategy.pattern;

public class Tiger extends Animal{
	public Tiger() {
		cry = new TigerCry();
		fly = new CantFly();
		name = "호랑이";
	}
	@Override
	public void performCry() {
		cry.cry();
	}
	@Override
	public void performFly() {
		fly.fly();
	}
	
	@Override
	public void move() {
		System.out.println("호랭이 이동");
	}
}