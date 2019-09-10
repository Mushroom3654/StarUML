package coffee;

public abstract class Beverage {
	public String description = "empty";
	
	public String getDescription() {
		return this.description; 
	}
	public abstract int cost();
}
