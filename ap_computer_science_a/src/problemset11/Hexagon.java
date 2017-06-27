package problemset11;

public class Hexagon implements Shape {
	
	//regular hexagon
	
	private int s = 0;
	
	Hexagon (int s) {
		setSide (s);
	}
	public void setSide (int side) {
		s = side;
	}
	public double getArea() {
		return (double) (Math.pow(s, 2)) * ( (3.0 * Math.sqrt(3)) / 2.0);
	};
	public int getPerimeter() {
		return s * 6;
	};
	public int getSideCount() {
		return 6;
	};

}
