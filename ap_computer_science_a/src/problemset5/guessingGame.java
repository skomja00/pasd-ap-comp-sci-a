package problemset5;

import java.util.Scanner;

public class guessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("You guessed it in "+GuessingGame()+" tries!");
	}
	public static int GuessingGame () {
		int number=(int) Math.ceil(Math.random() * 100);
		System.out.println(number);
		Scanner input = new Scanner(System.in);
		int guess;
		int guessCount=0;
		do {
			System.out.println("Enter your guess...");
			guess=input.nextInt();
			if (guess<number) {
				System.out.println("No, the number is bigger.");
			} else if (guess>number) {
				System.out.println("No, the number is less.");
				}
			guessCount++;
		} while (guess != number);
		return guessCount;
	}

}
