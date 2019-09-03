package strategy.pattern;

public abstract class Animal {
	protected IFly fly;
	protected ICry cry;
	String name;
	
	public Animal() {
		
	}
	
	public void performFly() {
		fly.fly();
	}
	public void performCry() {
		cry.cry();
	}
	public void move() {
		System.out.println("Animal : move()");
	}
	public void display() {
		System.out.println(name);
	};
}