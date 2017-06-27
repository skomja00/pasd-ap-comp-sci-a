package problemset4;

import java.util.Scanner;

public class digits {


	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer number to start:");
		int pattern;
		int number=input.nextInt();//2178,21978,219978,
		for (pattern=1;pattern<=4;pattern++) {
			while (number != reverse(number*4)) {
				number++;
			}
			System.out.println("The number is " + number + " and the reverse*4 is " + reverse(number*4));
			number++; 
		}
		System.out.println("finished.");
	}
 
	public static int reverse(int n) {
		String input = String.valueOf(n);
		String result = "";
		int i = input.length()-1;
		while (i >= 0) {
			result = result + input.charAt(i);
			i--;
		}
		int reversedInt = Integer.parseInt(result);
		return reversedInt;
		}
}