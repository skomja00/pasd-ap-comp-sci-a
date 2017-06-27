package problemset11;

public class Octagon implements Shape {

	int s = 0;
	
	Octagon (int side) {
		setSide (side);
	}
	public void setSide (int side) {
		s = side;
	}
	public double getArea() {
		return (double) 2 * Math.pow(s,2) * (1 + (int) Math.sqrt(2.0));
	};
	public int getPerimeter() {
		return s * 8;
	};
	public int getSideCount() {
		return 8;
	};

}
