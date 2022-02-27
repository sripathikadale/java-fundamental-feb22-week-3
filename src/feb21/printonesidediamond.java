package feb21;

public class printonesidediamond {

	public static void main(String[] args) {
		int n=5;
		int sp=n/2;
		int st=1;
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=st;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			if(i<=n/2)
			{
				sp++;
				st =st+1;
				count++;
			}
			else
			{
				sp--;
				st=st-1;
				count--;
			}
			System.out.println();
			
		}

		// TODO Auto-generated method stub

	}

}
