package problemset7;

import java.math.*;
import java.util.Scanner;

public class Pizza {
	private double radius;
	private double price;
	private int numSlices;
	public void inputTheValues () {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of the pizza, in inches: ");
		radius = input.nextDouble();
		
		System.out.println("Enter the price of the pizza: ");
		price = input.nextDouble();

		System.out.println("Enter the number of slices in each pizza: ");		
		numSlices = input.nextInt();

	}
	public double costPerSlice() {
		return price / numSlices;		
	}
	public double costPerSquareInch() {
		return price / (Math.PI * Math.pow(radius, 2));
	}
}
