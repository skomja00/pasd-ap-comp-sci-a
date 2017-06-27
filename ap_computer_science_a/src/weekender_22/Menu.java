package weekender_22;

public class Menu {

	public static void main(String[] args) {

		Sandwich cheeseburger = new Sandwich("cheeseburger",2.75);
		Sandwich clubSandwich = new Sandwich("clubSandwich",2.75);
		Salad spinachSalad = new Salad("spinachSalad",1.25);
		Salad coleSlaw = new Salad("coleSlaw",1.25);
		Drink orangeSoda = new Drink("orangeSoda",1.25);
		Drink cappuccino = new Drink("cappuccino",3.50);
		
		Trio order1 = new Trio (cheeseburger, spinachSalad, orangeSoda);
		System.out.println(order1.getName()+" $"+order1.getPrice());
		
		Trio order2 = new Trio (clubSandwich, coleSlaw, cappuccino);
		System.out.println(order2.getName()+" $"+order2.getPrice());
		
		//Trio order3 new Trio (spinachSalad, clubSandwich, orangeSoda); //constructor Trio(Salad, Sandwich, Drink) is undefined!
		
		//Trio order4 new Trio (cheeseburger, coleSlaw, coleSlaw); //constructor Trio(Sandwich, Salad, Salad) is undefined!
		
	}

}
