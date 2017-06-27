package weekender_22;

public class Cube implements Solid {

	private int side = 0;
	
	Cube (int s) {
		side = s;
	}
	public double getVolume () {
		return side*side*side;
	}
	
}
