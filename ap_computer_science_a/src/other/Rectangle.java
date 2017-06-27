package other;

public class Rectangle {

	private int width,height;
	public Rectangle (int w, int h) {
		width=w;
		height=h;
	}
	public int getArea () {
		return width*height;
	}
	public boolean equals (int area) {
		return getArea()==area;
	}
	public boolean equals (Rectangle other) {
		return getArea()==other.getArea();
	}
	public boolean equals (Object other) {
		return getArea()==((Rectangle)other).getArea();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle a1 = new Rectangle (1,1);
		Rectangle a2 = new Rectangle (2,2);
		Rectangle a3 = new Rectangle (1,1);
		if (a1.equals(a2.getArea())) {
			System.out.println("equal int area");
		}
		if (a1.equals(a3)) {
			System.out.println("equal Rectangle area");
		}
	}

}
