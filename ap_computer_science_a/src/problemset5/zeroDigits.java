package problemset5;

import java.util.Scanner;

public class zeroDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Number of zeroes "+zeroDigits("5024036"));
		System.out.println("Number of zeroes "+zeroDigits("743"));
		System.out.println("Number of zeroes "+zeroDigits("0"));
		
	}
	private static int zeroDigits (String string) {
		int i=0;
		int count=0;
		char c = '0';
		do {
			if (string.charAt(i)=='0') {count++;}
			i++;
		} while (i <= string.length()-1);
		return count;
	}

}
