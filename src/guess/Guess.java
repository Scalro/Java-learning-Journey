package guess;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int rNumber = (int)(Math.random()* 100+1);
		System.out.println(rNumber);
	}

}
