package problemset4;

import java.util.Scanner;

public class Triangle {
	
	public static boolean validTriangle(double first, double second, double third)
	{
		if (first + second < third || first + third < second || second + third < first)
		{
			System.out.println("Not a valid triangle");
			return false;
		}
		return true;
	}
	public static void isocelesTriangle(double first, double second, double third)
	{
		if (first == second 
			|| second == third
			|| first == third)
		{
			System.out.println("Acute");
		}
	}
	public static void equilateralTriangle(double first, double second, double third)
	{
		if (first == second && second == third)
		{
			System.out.println("Acute");
		}
	}
	public static void acute2Triangle(double first, double second, double third)
	{
		if (first == third || first == second && first < third)
		{
			System.out.println("Acute");
		}
	}
	public static void rightTriangle(double first, double second, double third)
	{
		if (Math.pow(first, 2) + Math.pow(second, 2) == Math.pow(third, 2) //a squared + b squared = c squared
		|| Math.pow(third, 2) + Math.pow(second, 2) == Math.pow(first, 2) //b + c = a squared etc...
		|| Math.pow(first, 2) + Math.pow(third, 2) == Math.pow(second, 2))
		{
			System.out.println("Right");
		}
	}

	public static void obtuseTriangle(double first, double second, double third)
	{
		if (Math.pow(first, 2) + Math.pow(second, 2) < Math.pow(third, 2) //a squared + b squared = c squared
		|| Math.pow(third, 2) + Math.pow(second, 2) < Math.pow(first, 2) //b + c = a squared etc...
		|| Math.pow(first, 2) + Math.pow(third, 2) < Math.pow(second, 2)) {
			System.out.println("Obtuse");
		}
	}
	public static void main (String [] args)
	{
		System.out.println("Enter in a side length for a triangle");
		Scanner scan = new Scanner(System.in);
		double first = scan.nextDouble();
		System.out.println("Enter in another side length");
		double second = scan.nextDouble();
		System.out.println("Enter the last side length");
		double third = scan.nextDouble();
		if (validTriangle(first, second, third)) {
			equilateralTriangle(first, second, third);
			rightTriangle(first, second, third);
			obtuseTriangle(first, second, third);			
			isocelesTriangle(first, second, third);			
		};	
		
	}
}
