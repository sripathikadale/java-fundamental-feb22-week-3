package feb21;
import java.util.Scanner;
public class squareofnumlessthn10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int square=0;
		num=num*num;
		if(num>10)
		{
			System.out.println("square of a number is greater then 10" );
		}
		else if(num<10)
		{
			System.out.println( num );
		}
		else
		{
			System.out.println("entered number is equal to 10" );
		}
		// TODO Auto-generated method stub

	}

}
