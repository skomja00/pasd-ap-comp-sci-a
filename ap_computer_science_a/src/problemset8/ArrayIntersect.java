package problemset8;

public class ArrayIntersect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {3,4,5,6};
		int [] b = {1,2,3};	
		int [] c = {7,8,9};	
		int [] d = {};
		System.out.println(intersection(a,b)); //true
		System.out.println(intersection(b,c)); //false
		System.out.println(intersection(a,c)); //false
		System.out.println(intersection(a,d)); //false
		}
	public static boolean intersection (int [] a, int [] b) {
		boolean result=false;
		for (int x : a) {			//take each item in int array a
			for (int y : b) {		//and compare to each item in int array b
				if (x == y) {		//if one matches set it to true
					result=true;
				}
			}
		}
		return result;
	}
}
