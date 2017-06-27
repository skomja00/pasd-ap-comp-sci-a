package other;

public class Pascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=0;
		for (int row=0;row<=6;row++) {
			for (int col=0;col<=row;col++) {
				number=nChooseK2(row,col);
				System.out.print(number+" ");
			}
			System.out.println();
		}
		//System.out.println(factorial (5));
		//System.out.println(factorial2 (5));
	}
	public static int nChooseK (int n, int k) {
		/*This method calculates how many groups of an object can be made
		 * from a larger group/values of Pascal's triangle
		 * @param n the row number in Pascal's triangle
		 * @param k the column number in Pascal's triangle*/
		if (k==0) return 1;
		return nChooseK (n,k-1)*(n-k+1)/k; //note "/k" was "/r" on free response assignment sheet;
	}
	public static int nChooseK2 (int n, int k) {
		return factorial2(n)/(factorial2(k)*(factorial2(n-k)));
	}
	public static int factorial (int f) {
		if (f==1) return f;
		return factorial(f-1)*f;
	}
	public static int factorial2 (int f) {
		int factorial=1;
		while (f>1) {
			factorial=factorial*f;
			f--;
		}
		return factorial;
	}
}