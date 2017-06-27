package other;

public class weekEnder8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TAN - "+scrambleWord("TAN"));
		System.out.println("AARDVARK - "+scrambleWord("AARDVARK"));
	}
	public static String scrambleWord (String word) {
		String tmp="";
		String scrambleWord="";
		for (int i=0;i<word.length()-1;i=i+2) {
			if (word.charAt(i)=='A' && word.charAt(i+1)=='A') {
				scrambleWord=scrambleWord+word.charAt(i); }
			else {
				tmp=word.substring(i,i+1);
				scrambleWord=scrambleWord+word.charAt(i+1);
				scrambleWord=scrambleWord+tmp.toString();
			}
			tmp="";
		}
		return scrambleWord; //fix this!! need to grab last character of string and add to end.
	}
}
