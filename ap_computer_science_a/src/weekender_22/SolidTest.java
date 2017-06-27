package weekender_22;

public class SolidTest {

	public static void main(String[] args) {

		Solid[] solids = new Solid[2];
		solids[0] = new Cube(100);
		solids[1] = new Pyramid (150, 100);
		System.out.println("Cube: "+solids[0].getVolume());
		System.out.println("Pyramid: "+solids[1].getVolume());
	}
	
}
