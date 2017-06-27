package problemset7;

public class PizzaTest {

	public static void main(String[] args) {
	
		Pizza p = new Pizza();
		p.inputTheValues();
		System.out.println("That's $" + p.costPerSlice() + " per slice." );
		System.out.println(" which is $" + p.costPerSquareInch() + " per square inch!");
	}
}
