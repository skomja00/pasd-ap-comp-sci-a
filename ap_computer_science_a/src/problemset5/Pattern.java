package problemset5;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern();
	}
	private static void Pattern () {
		int j=0,i=5;
		do {
			j=i;
			do {
				System.out.print("*");
				j--;
			} while (j>=1);
			i--;
			System.out.println();
		} while (i>=1);	
	}
}
