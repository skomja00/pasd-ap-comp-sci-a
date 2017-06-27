package problemset6;

public class Palindrome {

	public static void main(String[] args) {
		// a palindrome reads the same forward and backward
		System.out.println(palindrome("dad"));
		System.out.println(palindrome("dad!"));
		System.out.println(palindrome("program"));
		System.out.println(palindrome("a man a plan a canal panama"));
	}
	public static boolean palindrome (String phrase) {
		boolean palindrome=true;
		//phrase=phrase.replaceAll("[ ,.!@#$%^&*()-+;:]","");
		phrase=phrase.replaceAll(" ","");
		phrase=phrase.replaceAll(".","");
		int left=0,right=phrase.length()-1;
		while (left<=right && palindrome==true) {
			if (phrase.toUpperCase().charAt(left)==phrase.toUpperCase().charAt(right)) 
				{palindrome=true;}
			else
				{palindrome=false;}				
			left++;
			right--;
		}
		return palindrome;
	}
}
