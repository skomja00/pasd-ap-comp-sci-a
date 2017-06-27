package problemset11;

public class Triangle implements Shape {
	
	private int a = 0;
	private int b = 0;
	private int c = 0;
	
	Triangle (int a, int b, int c) {
		setSideA(a);
		setSideB(b);
		setSideC(c);
	}
	public void setSideA (int sideA) {
		a = sideA;
	}
	public void setSideB (int sideB) {
		b = sideB;
	}
	public void setSideC (int sideC) {
		c = sideC;
	}
	public double getArea() {
		if (this.validTriangle(a, b, c)) {
			if (rightTriangle(a,b,c)) {
				return 1.0;
			}
			if (equilateralTriangle(a,b,c)) {
				return 2.0;
			}
			if (isocelesTriangle(a,b,c)) {
				return 3.0;
			}
			if (acute2Triangle(a,b,c)) {
				return 4.0;
			}
		}
		return (double) 0.0;
	};
	public int getPerimeter() {
		return a + b + c;
	};
	public int getSideCount() {
		return 3;
	};
	public boolean validTriangle(double first, double second, double third) {
		
		if (first + second < third || first + third < second || second + third < first)
		{
			//System.out.println("Not a valid triangle");
			return false;
		}
		return true;
	}
	public boolean isocelesTriangle(double first, double second, double third) {
		
		if (first == second 
			|| second == third
			|| first == third)
		{
			//System.out.println("Isoceles");
			return true;
		}
		return false;
	}
	public boolean equilateralTriangle(double first, double second, double third) {
		
		if (first == second && second == third)
		{
			//System.out.println("Equilateral");
			return true;
		}
		return false;
	}
	public boolean acute2Triangle(double first, double second, double third) { 
		
		if (first == third || first == second && first < third)
		{
			//System.out.println("Acute");
			return true;
		}
		return false;
	}
	public boolean rightTriangle(double first, double second, double third) { 
		
		if (Math.pow(first, 2) + Math.pow(second, 2) == Math.pow(third, 2) //a squared + b squared = c squared
		|| Math.pow(third, 2) + Math.pow(second, 2) == Math.pow(first, 2) //b + c = a squared etc...
		|| Math.pow(first, 2) + Math.pow(third, 2) == Math.pow(second, 2))
		{
			//System.out.println("Right");
			return true;
		}
		return false;
	}
	public boolean obtuseTriangle(double first, double second, double third) {
		
		if (Math.pow(first, 2) + Math.pow(second, 2) < Math.pow(third, 2) //a squared + b squared = c squared
		|| Math.pow(third, 2) + Math.pow(second, 2) < Math.pow(first, 2) //b + c = a squared etc...
		|| Math.pow(first, 2) + Math.pow(third, 2) < Math.pow(second, 2)) {
			//System.out.println("Obtuse");
			return true;
		}
		return false;
	}

}
