package Java_Programming_Assessment;

import java.util.Scanner;

public class Challenge08 {

	public static void main(String[]args)
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the year");
		 int year = sc.nextInt();
	       
		 if((year%4==0 && year%100!=0) || year%400==0)
		 {
			 System.out.print("It's an leap year");
		 }
		 else
		 {
			 System.out.print("It's not a leap year");
		 }

	        
	}
}
