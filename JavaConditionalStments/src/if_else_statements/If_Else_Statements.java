package if_else_statements;

public class If_Else_Statements {

	public static void main(String[] args) {
		
		int scores = 65;
		String Grade;
		
		if (scores >= 90)
			Grade = "A";
		
		else if (scores >= 75)
			Grade = "A-";
		
		else if (scores >= 67)
			Grade = "B+";
		
		else if (scores >= 60)
			Grade = "B";
		
		else if (scores >= 55)
			Grade = "B-";
		
		else if (scores >= 49)
			Grade = "C+";
		
		else if (scores >= 45)
			Grade = "C";
		
		else if (scores >= 39)
			Grade = "C-";
		
		else if (scores >= 35)
			Grade = "D+";
		
		else if (scores >= 30)
			Grade = "D";
		
		else if (scores >= 25)
			Grade = "D-";
		
		else 
			Grade = "F";
		
		System.out.println("Your Grade is : " + Grade);
		
		
	}

}
