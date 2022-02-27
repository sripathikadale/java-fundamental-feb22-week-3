package feb21;
import java.util.Scanner;
public class numbw0and10even {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		
		if((num<=10) && (num>=0))
		{
			if(num%2==0)
			{
				System.out.println(num);
			}
		}
		

	}

}
