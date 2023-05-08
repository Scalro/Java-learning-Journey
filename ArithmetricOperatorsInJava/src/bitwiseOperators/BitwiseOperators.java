package bitwiseOperators;

public class BitwiseOperators {

	public static void main(String[] args) {
		
		int a = 12;
		int b = 14;
		
		System.out.println("(a<<b) + (a>>b) = :" + ((a<<3) + (b>>2)));
		
		System.out.println("a&b = :" + (a&b));
		
		System.out.println("a|b = :" + (a|b));
		
		System.out.println("a^b = :" + (a^b));
		

	}

}
