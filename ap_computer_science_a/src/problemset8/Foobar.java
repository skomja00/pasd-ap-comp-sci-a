package problemset8;

public class Foobar
{
	public static void main (String [] args) 	{
		double [] r = new double [20]; //double [20] r;
		for (int i = 0; i <= r.length/*()*/; i++) { 
			//length is a field not a method
			r[i] = Math.random() * 100;
		}
	}
}

