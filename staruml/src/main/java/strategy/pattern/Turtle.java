package strategy.pattern;

public class Turtle extends Animal{
		Turtle(){
			fly = new CantFly();
			cry = new NeverCry();
			name = "거북이";
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
			System.out.println("거북이 이동");
		}
}
