package feb21;
import java.util.Scanner;
public class sumofnnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum=0;
		int i=1;
		while(i<=num)
		{
			
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
		
		// TODO Auto-generated method stub

	}

}
