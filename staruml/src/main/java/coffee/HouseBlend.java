package coffee;

public class HouseBlend extends Beverage{
	public HouseBlend(){
		this.description = "HouseBlend";
	}
	@Override
	public int cost() {
		return 5000;
	}
}
