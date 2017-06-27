package weekender_13;

public class SelfDivisor {

	public static void main(String[] args) {
		System.out.println("Is 128 is self divisor? "+isSelfDivisor(128));
		System.out.println("Is 10 is self divisor? "+isSelfDivisor(10));
		System.out.println("Is 48 is self divisor? "+isSelfDivisor(48));

		System.out.print("First 3 self divisors greater than 10 are ");			
		for (int i : firstNumSelfDivisor(10, 3)) {
			System.out.print(i+" ");			
		}
		System.out.println();						


		System.out.print("First 5 self divisors greater than 20 are ");			
		for (int i : firstNumSelfDivisor(20, 5)) {
			System.out.print(i+" ");			
		}
		System.out.println();						
	
	}
	public static boolean isSelfDivisor (int number) {
		/** @param number the number to be tested 
		 *       Precondition: number > 0 
		 * @return true if every decimal digit of number is a divisor of number 
		 *         false otherwise
		 */
		int i = 0; //index for array
		int num = number; //copy of number param to be used to convert into single digits
		int [] numberArray = new int [String.valueOf(number).length()]; //array of digits of the number. Use a string just to get number of digits. 
		boolean done = false;
		boolean selfDivisor = false;
		
		//convert number into an integer array of digits. 
		while (num> 0){
			numberArray [i] = num % 10;
            num = num / 10;
            i++;
        }
		
		//loop through digits checking if number is divisible by each digit. 
		i = 0;
		while (!done && i < numberArray.length) { 
			if (numberArray [i] == 0) { //any number containing a zero digit is NOT a selfDivisor. You can't divide by 0! we are done.
				selfDivisor = false;
				done = true; }
			else 
				if (number % numberArray [i] == 0) { //if each digit divides evenly/no remainder we have a self dividing number. keep checking.
					selfDivisor = true; 
					done = false;}
				else {
					selfDivisor = false; //if any digit doesn't divide evenly number is not a self divisor, and we are done.
					done = true;
				}				
			i++;
		}
		return selfDivisor;
	}
	public static int[] firstNumSelfDivisor (int start, int num) {
		/* @param starting point for values to be checked 
		 *       Precondition: start > 0
		 * @param the size of the array to be returned 
		 *       Postcondition: num > 0 
		 * @return an array containing the first num integers >= start that are self-divisors 
		 */
		start++;
		int count = 0;
		int[] selfDivisors = new int [num];
		while (count <= num - 1) {
			if (isSelfDivisor(start)) {
				selfDivisors[count] = start;
				count++;
			}
			start++;
		}
		return selfDivisors;
	}
}
