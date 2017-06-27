package problemset6;

public class Roman {

	public static void main(String[] args) {
		//convert roman numeral to arabic number
		//Add smaller symbol values that are placed after large symbol values
		//Subtract smaller symbol values that are placed before larger symbol values	
		System.out.println("IV("+convert("IV")+")");
		System.out.println("LXXXVII"+"("+convert("LXXXVII")+")");
		System.out.println("CCXIX"+"("+convert("CCXIX")+")");
		System.out.println("MCCCLIV"+"("+convert("MCCCLIV")+")");
		System.out.println("MMDCLXXIII"+"("+convert("MMDCLXXIII")+")");
		System.out.println("MCDLXXVI"+"("+convert("MCDLXXVI")+")");
	}
	public static int convert (String romanNumeral) {
		int arabicNumber=0;
		for (int i=0;i<=romanNumeral.length()-1;i++) {
			if (i==romanNumeral.length()-1){ 
				arabicNumber=arabicNumber+arabic(romanNumeral.charAt(i));
			} else
				if (arabic(romanNumeral.charAt(i)) < arabic(romanNumeral.charAt(i+1))) //If a smaller value is before a larger subtract instead of adding
					{arabicNumber=arabicNumber-arabic(romanNumeral.charAt(i));}
				else 
					{arabicNumber=arabicNumber+arabic(romanNumeral.charAt(i));		
				}
		}
		return arabicNumber;
	}
	public static int arabic (Character roman) {
		if (roman.equals('M')) {return 1000;
		} else 
		if (roman.equals('D')) {return 500;
		} else 
		if (roman.equals('C')) {return 100;
		} else 
		if (roman.equals('L')) {return 50;
		} else 
		if (roman.equals('X')) {return 10;
		} else 
		if (roman.equals('V')) {return 5;
		} else 
		if (roman.equals('I')) {return 1;
		} else
		return 0;
	}
}
