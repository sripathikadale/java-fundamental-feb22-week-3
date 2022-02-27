package feb21;

import java.util.Scanner;

public class lefttriangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int rows= sc. nextInt();
		System.out.println("enter the number of rows : ");
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		// TODO Auto-generated method stub

	}

}
