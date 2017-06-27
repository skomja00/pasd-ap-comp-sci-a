package weekender_13;

public class questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] samples = {1.0, 2.1, 3.2, 4.3};
		int len = samples.length;
		change(samples,len);
		
		int [] factors = {2, 3, 4, 7, 2, 5};
		int product = 1;
		for (int i = 1; i < factors.length; i += 2) {
			product *= (factors [i] % factors [i - 1]); // 3/2, 7/4, 5/2
		}
	}
	public static void change (double [] nums, int n) {
		for (int k = 0; k < n; k++) {
			nums [k] = 5.4;
		}
	}
	public static int addPositiveOddValues (int [] arr, int n) {
		int sum = 0;
		// <statement1>
		for (int i = 0; i < n; i++) {
			//statement2
			if ( (arr[i] > 0) && (arr[i] % 2) != 0) {
				sum += arr [i];				
			}
		}
		return sum;
	}

}
