package feb21;
import java.util.Scanner;
public class invertedvstar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows=sc.nextInt();
		int s=0;
		for(int i=rows;i>=1;i--)
		{
			
		
			for(int j=1;j<=i;j++)
			{
			
				System.out.print("*");
			}
			
			for(int k=1;k<=2*(rows-i);k++)
			{
				System.out.print(" ");
			}
		
		   for(int l=1;l<=i;l++)
			{
				System.out.print("*");	
				
				
			}
		   System.out.println( );
		}
		// TODO Auto-generated method stub

	
	}
}
