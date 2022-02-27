package feb21;
import java.util.Scanner;

public class branch {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the year");
	int year = sc.nextInt();
	System.out.println("enter the course");
	String course = sc.next();
	switch(year)
		{
	case 1:
		System.out.println("all the subjects are common");
		break;
	case 2:
	case 3:
	case 4:
		
		switch(course)
		{
		case "IT":
		case "CSE":
			System.out.println("you have opted for computer branch");
			break;
		case "ECE":
		case "EEE":
			System.out.println("you have opted for electrical branch");
			break;
		case "mechanical":
			System.out.println("you have opted for mechanical branch");
			break;
		default:
				System.out.println("invalid input");
				break;
		}
	break;	
	default:
		System.out.println("invalid input");
		break;
		
		}
		// TODO Auto-generated method stub

	}

}
