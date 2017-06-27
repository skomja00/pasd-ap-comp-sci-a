package weekender_22;

public class AirPlane {
	
	private int fuel;
	
	public AirPlane () {fuel = 0;}

	public AirPlane (int g) {fuel = g;}
	
	public void addFuel () {fuel++;}
	
	public String toString () {return fuel + "  ";}
	
}
