package feb21;

import java.util.Scanner;

public class numberofdigitsinuser {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);	
		System.out.println("enter the number :");
		int num= sc.nextInt();
			int count=0;
			
			while(num>0)
			{
				
				count ++;
				num=num/10;
				
			}
			System.out.println("number of digits  " +count);
			

		}
	

	}


