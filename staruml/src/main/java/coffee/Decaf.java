package coffee;

public class Decaf extends Beverage{
	public Decaf(){
		this.description = "Decaf";
	}
	@Override
	public int cost() {
		return 4000;
	}
}
