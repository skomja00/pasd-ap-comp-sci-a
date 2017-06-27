package problemset5;

import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problem4();
	}

	private static void problem4 () {
		String answer="";
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("She sells seashells by the seashore.");
			System.out.println("Do you want to hear it again?");
			answer=input.next();	      
		} while (answer.equals("y"));
	}

}
