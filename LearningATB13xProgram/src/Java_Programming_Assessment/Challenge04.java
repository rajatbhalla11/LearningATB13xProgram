package Java_Programming_Assessment;
import java.util.*;
public class Challenge04 {

	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		
		int PreIncrement  = ++a;
		System.out.println("Pre-increment: " + PreIncrement);
		int PostIncrement  = a++;
		System.out.println("Post-increment: " + PostIncrement);
		int Predecrement = --a;
		System.out.println("Pre-decrement: " + Predecrement);
		int Postdecrement = a--;
		System.out.println("Post-decrement: " + Postdecrement);
	}
}
