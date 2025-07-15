package Java_Programming_Assessment;

import java.util.Scanner;

public class Challenge14_PyramidPattern {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of rows");
		int m =sc.nextInt();
		
		for(int i = 1;i<=m;i++)
		{
			for(int j = i;j <=m-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
			    System.out.print("*");
			}
			for(int p=1;p<=i-1;p++)
			{
			    System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
