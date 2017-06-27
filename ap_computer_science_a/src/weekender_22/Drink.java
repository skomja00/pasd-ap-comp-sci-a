package weekender_22;

public class Drink implements MenuItem {

	private String name = "";
	private double price = 0.00;
	
	public Drink (String n, double p) {
		name = n;
		price = p;
	}
	public String getName(){
		return name;
	}
	public double getPrice() {
		return price;
	}

}
