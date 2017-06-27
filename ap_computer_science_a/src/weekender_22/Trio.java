package weekender_22;

public class Trio implements MenuItem {

	Sandwich sandwich;
	Salad salad;
	Drink drink;
	double trioPrice = 0.00;
	
	Trio (Sandwich sw, Salad s, Drink d) {
		sandwich = sw;
		salad = s;
		drink = d;
	}
	
	public String getName(){
		return sandwich.getName()+"/"+salad.getName()+"/"+drink.getName();
	}
	public double getPrice() {
		if (sandwich.getPrice() <= salad.getPrice() && sandwich.getPrice() <= drink.getPrice()) { //sandwich is least expensive
			trioPrice = salad.getPrice()+drink.getPrice(); } 
		
		else if (salad.getPrice() <= sandwich.getPrice() && salad.getPrice() <= drink.getPrice()) { //salad ...
			trioPrice = sandwich.getPrice()+drink.getPrice(); } 
		
		else if (drink.getPrice() <= sandwich.getPrice() && drink.getPrice() <= salad.getPrice()) { //drink ...
			trioPrice = salad.getPrice()+sandwich.getPrice(); }
		
		return trioPrice;
		
	}
}


