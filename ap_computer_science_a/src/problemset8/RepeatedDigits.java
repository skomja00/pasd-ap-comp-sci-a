package problemset8;

import java.util.Scanner;

public class RepeatedDigits {

	public static void main(String[] args) {
		int [] digitCount = {0,0,0,0,0,0,0,0,0,0}; 							//1 dimensional integer array with a counter for each for the 10 numerical digits
		int digit=0;														//use this as index for our digit count. so digitCount[2] is the count of occurrences of the digit 3
					;														//										and digitCount[3] is the count of occurrences of the digit 4 etc...
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer:" );  
		String stringInteger = input.nextLine();							//get the user input as a string so we can substring one digit at a time
		for (int i = 0; i < stringInteger.length(); i++) {
			digit = Integer.valueOf(stringInteger.substring(i, i+1)); 		//pick one digit at a time returning the integer value of each digit
			digitCount [digit] = digitCount [digit] + 1; 					//add +1 to the counter for that digit. The digit itself is be used as the index in the array
		}
		System.out.println("Digit:        0  1  2  3  4  5  6  7  8  9");	//print the results
		System.out.print  ("Occurrences:");		
		for (int i = 0; i < 10; i++ ) {
			System.out.print("  "+digitCount[i]);
		}		
	}
}
	


