package other;

public class IntObjectText {
	public static IntObject someMethod (IntObject obj) {
		IntObject ans = obj;
		ans.increment();
		return ans;
	}
	public static void main (String [] args) {
		IntObject x = new IntObject (2);
		IntObject y = new IntObject (7);
		IntObject a = y;
		x = someMethod(y);
		a = someMethod(x);
		System.out.println("done");
	}
}
