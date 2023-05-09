package switchCase;

public class SwitchCase {

	public static void main(String[] args) {
		
		
		int schools = 7;
		
		String school;
		
		switch (schools) {
		
		case 1:
			school = "Education";
			break;
		case 2:
			school = "Sciences";
			break;
		case 3:
			school = "Technology";
			break;
		case 4:
			school = "Nursing";
			break;
		case 5:
			school = "Theology";
			break;
		case 6:
			school = "Media and Communications";
			break;
		case 7:
			school = "Food and Nutrition";
			break;
			
			default:
			school = "General";
			break;
			
		}
		
		System.out.println(school);

	}

}
