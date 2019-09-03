package strategy.pattern;

public class Zoo {
	public static void main(String[] args) {
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		Animal turtle = new Turtle();
		System.out.println("---------------");
		tiger.display();
		tiger.performCry();
		System.out.println("---------------");
		eagle.display();
		eagle.performFly();
		System.out.println("---------------");
		turtle.display();
		turtle.performCry();
		turtle.performFly();
		turtle.move();
		
	}
}