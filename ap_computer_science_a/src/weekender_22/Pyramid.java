package weekender_22;

public class Pyramid implements Solid {

	private int base = 0;
	private int height = 0;
	
	public Pyramid (int b, int h) {
		base = b;
		height = h;
	}
	
	public double getVolume() {
		return (base * base * height) / 3;
	}
	
	
}
