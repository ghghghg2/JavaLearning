// https://openhome.cc/Gossip/Java/StandAPI-class.html

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int num =  (int) (Math.random() * 10);
		
		int guess;
		
		do {
			System.out.println("Input number 0 ~ 9:");
			guess = userInput.nextInt();
		}while(guess != num);
		System.out.println("You got it. XD");
		

	}

}
