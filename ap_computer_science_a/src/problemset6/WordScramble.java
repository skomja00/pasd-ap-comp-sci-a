package problemset6;

public class WordScramble {

	public static void main(String[] args) {
		// scramble a sentence by flipping two characters of every word other than the first and last characters
		String s="Anyone who can only think of one way to spell a word obviously lacks imagination. Mark Twain";
		System.out.println(s);
		System.out.println(scramble(s));
	}
	public static String scramble (String s) {
		int beg=0,end=0,rand=0;
		String word="";
		String r="";
		String t="";
		char a=' ';
		char b=' ';
		boolean done=false;
		t=s.substring(0,s.indexOf(".")); //stop at the end of the sentence
		int len=t.length();
		while (!done) {
			end=t.indexOf(' ',beg);
			if (end < 0) { //no word separators left grab last word
				word=t.substring(beg, len);
				done=true; } 
			else {
				word=t.substring(beg, end);
			}
			if (word.length() <= 3) { //only 1 character so can't flip
				r=r+word+" ";}
			else if (word.length() == 4) { //just flip 2nd and 3rd letters
				r=r+word.substring(0,1)+word.substring(2,3)+word.substring(1,2)+word.substring(3,4)+" ";}
			else if (word.length() >= 5) { 
				rand=random(2,word.length()-1); //flip random position from the 2nd char to next to last char 
				a=word.charAt(rand-1);
				b=word.charAt(rand);
				word=word.substring(0,rand-1)+b+a+word.substring(rand+1,word.length());
				r=r+word+" "; 
			}
		beg=end+1;
		}
		return r.substring(0,r.length()-1)+s.substring(s.indexOf(".")); //don't include the last space, and add back everything after the period
	}
	public static int random (int min, int max) {
	// Returns a random number between min (inclusive) and max (exclusive)
	  return ( (int) (Math.random() * (max - min))) + min;
	}
}
