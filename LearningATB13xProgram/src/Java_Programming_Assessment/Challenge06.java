package Java_Programming_Assessment;
import java.util.*;
public class Challenge06 {

	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a  = sc.nextInt();
		
		if(a>0)
		{
			System.out.println("Number is positive");
		}
		else if(a==0)
		{
			System.out.println("number is zero");
		}
		else if(a<0)
		{
			System.out.println("Number is negative");
		}
	}
}
