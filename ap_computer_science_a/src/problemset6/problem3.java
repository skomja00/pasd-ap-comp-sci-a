package problemset6;

public class problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printLetters("Rabbit");
	}
	public static void printLetters (String text) {
		for (int i=0;i<text.length()-1;i++) {
			System.out.print(text.charAt(i)+"-");
		}
		System.out.println(text.charAt(text.length()-1));
	}
}