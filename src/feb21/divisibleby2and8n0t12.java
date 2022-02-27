package feb21;
import java.util.Scanner;
public class divisibleby2and8n0t12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int num=sc.nextInt();
		boolean result=(num%2==0)&&(num%8==0)&!(num%12==0);
		{
			System.out.println(result);
		}
		
		

	}

}
