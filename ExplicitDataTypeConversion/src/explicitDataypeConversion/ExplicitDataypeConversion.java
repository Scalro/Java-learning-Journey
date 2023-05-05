package explicitDataypeConversion;

public class ExplicitDataypeConversion {

	public static void main(String[] args) {
		
		double d = 234567.456;
		System.out.println(d);
		
		float f = (float)d;
		System.out.println(f);
		
		long l = (long)d;
		System.out.println(l);
		
		int i =(int)l;
		System.out.println(i);

	}

}
