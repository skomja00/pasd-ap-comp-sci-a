package problemset11;

public class Geometry {

	/*
	Problem 2: (30 points)	Use folder Geometry
	The use of inheritance is prevalent in Java class libraries. One notable example is in the drawing of two-dimensional graphics. 
	•	Create an interface called Shape with a getArea(), getPerimeter(), and getSideCount() method. 
	•	Create classes named Triangle, Hexagon, and Octagon that each implement the shape interface and implement the necessary methods 
	    by defining appropriate fields. Depending on your knowledge of Geometry, you may need to look up formulas for the areas of these shapes. 
	    You may assume that the hexagons and octagons are regular hexagons (meaning equilateral and equiangular). 
	•	Each of these classes should have at least one constructor that takes in the length of the sides as its parameters.
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangle t = new Triangle (6, 14, 8);
		Hexagon h = new Hexagon (8);
		Octagon o = new Octagon (3);
		
		System.out.println("triangle area="+t.getArea()+", triangle perim="+t.getPerimeter()+", triangle side count="+t.getSideCount());
		System.out.println("hexagon area="+h.getArea()+", hexagon perim="+h.getPerimeter()+", hexagon side count="+h.getSideCount());
		System.out.println("octagon area="+o.getArea()+", octagon perim="+o.getPerimeter()+", octagon side count="+o.getSideCount());

	}

	
}
																					