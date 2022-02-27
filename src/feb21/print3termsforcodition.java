package feb21;
import java.util.Scanner;
public class print3termsforcodition {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		int term = 4*n+9%3;
		int count=4;
		if(4*n+9%3==0)
		{
			for(int i=0;i<count;i++)
			{
				count ++;
			}
		}	
		System.out.println(term);	
		}
	
}	
			
				
			
		
		// TODO Auto-generated method stub

	


