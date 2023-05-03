package guess;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int rNumber = (int)(Math.random()* 100+1);
		//System.out.println(rNumber);
		
		int guess = 0;
		while(guess != rNumber) {
			System.out.println("Guess the number between 1 and 100: ");
			guess = scan.nextInt();
			
			if (guess < rNumber)
				System.out.println(guess + " is lower, Try Again!");
			else if (guess > rNumber)
				System.out.println(guess + " is higher, Try Again!");
			else 
				System.out.println(guess + " is Correct, Congratulation!");
		}
	}

}