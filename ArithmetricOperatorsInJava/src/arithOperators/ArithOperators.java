package arithOperators;

public class ArithOperators {

	public static void main(String[] args) {
		
		int outcome = 20 + 15;
		System.out.println("The sum of 20 and 15 is :" + outcome);
		int init_Outcome = outcome;
		
		init_Outcome = outcome - 7;
		System.out.println("The difference of " + outcome + " and 7 is :" + init_Outcome);
		
		init_Outcome = outcome / 5;
		System.out.println("The division of " + outcome + " and 5 is :" + init_Outcome);
		
		init_Outcome = outcome %9;
		System.out.println("The modulus of " + outcome + " and 9 is :" + init_Outcome);
		
		init_Outcome = outcome / 3;
		System.out.println("The multiplication of " + outcome + " and 3 is :" + init_Outcome);

	}

}
