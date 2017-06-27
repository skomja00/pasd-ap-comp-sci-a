package other;

public class Sphere {
	public static final double pi = 3.141592654;
	public static void main(String[] args) {
		// volume of a sphere 
		System.out.println("volume r=4 is "+volume(4));
	}
	public static double volume (int r) {
		System.out.println(Math.pow((double)4, 3));
		System.out.println(Math.pow((int)4, 3));
		return 4 / 3 * pi * Math.pow(r, 3);
		
	}
}