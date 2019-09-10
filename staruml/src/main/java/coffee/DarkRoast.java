package coffee;

public class DarkRoast extends Beverage{
	public DarkRoast(){
		this.description = "DarkRoast";
	}
	@Override
	public int cost() {
		return 3000;
	}
}
