package feb21;
import java.util.Scanner;
public class lessorgreater10and5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if((num<=10)|| num>=10)
		{
			System.out.println("entered number is greater then 10 or lesser then 10");
		}
		
			if(num<=10)
			{
				if(num>5)
				{
				System.out.println("num is greater then 5");
			}
			else
			{
				System.out.println("num is less then 5");
			}
		}
			else
			{
				System.out.println("number is greater then 10");
			}
		
		// TODO Auto-generated method stub

	}

}
