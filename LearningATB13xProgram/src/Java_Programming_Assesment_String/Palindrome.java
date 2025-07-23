package Java_Programming_Assesment_String;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check for palindrome");
		String str = sc.nextLine();
		String Rstr = "";
		String str3 = str.toLowerCase();
		for(int i=str3.length()-1;i>=0;i--)
		{
			Rstr = Rstr + str3.charAt(i);
			
		}
		
		if(str3.equals(Rstr))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
}
