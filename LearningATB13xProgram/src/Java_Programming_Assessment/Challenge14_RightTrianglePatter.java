package Java_Programming_Assessment;

import java.util.Scanner;

public class Challenge14_RightTrianglePatter {

	public static void main(String[]args)
	{
	        Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of rows");
			int m =sc.nextInt();
			for(int i = 1;i<=m;i++)
			{
				for(int j = 1;j <=i;j++)
				{
					System.out.print("*");
				}
				System.out.println(" ");
			}
}
	}
