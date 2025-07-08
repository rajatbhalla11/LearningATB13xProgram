package Java_Programming_Assessment;
import java.util.*;
public class Challenge02 {
		

		public static void main(String[]args)
		{
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first number");
			int a = sc.nextInt();
			System.out.println("Enter second number");
			int b = sc.nextInt();
			
			//comparison
			System.out.println("a == b: " + (a == b));
	        System.out.println("a > b: " + (a > b));
	        System.out.println("a < b: " + (a < b));

	        // Logical
	        System.out.println("(a > b) && (a > 0): " + ((a > b) && (a > 0)));
	        System.out.println("(a < b) || (a > 0): " + ((a < b) || (a > 0)));
	        System.out.println("!(a > b): " + (!(a > b)));
		}
		}
