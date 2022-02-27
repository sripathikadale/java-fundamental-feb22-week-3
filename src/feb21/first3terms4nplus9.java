package feb21;

public class first3terms4nplus9 {

	public static void main(String[] args) {
		int n=4;
		int term1=0;
		int term2=0;
		int term3=0;
		for(int i=1;i<=n;i++)
		{
			 term1 = 4*n+9;
			 term2= term1+4*n+9;
			 term3 =term1+term2+4*n+9;
		}
		System.out.println(term1);
		System.out.println(term2);
		System.out.println(term3);
		// TODO Auto-generated method stub

	}

}
