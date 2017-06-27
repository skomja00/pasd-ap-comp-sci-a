package weekender_22;

public class AirPlaneTest {

	public static void main(String[] args) {

		AirPlane plane = new AirPlane (4);
		AirPlane jet = new Jet(4);
		
		System.out.print(plane);
		plane.addFuel();
		System.out.print(plane);

		System.out.print(jet);
		jet.addFuel();
		System.out.print(jet);
				
	}

}
