package strategy.pattern;

public class Eagle extends Animal{
		public Eagle() {
			cry = new BirdCry();
			fly = new CanFly();
			name = "독수리";
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
			System.out.println("독수리 이동");
		}
}