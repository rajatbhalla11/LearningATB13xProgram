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
			
			
	        
	        
	     // Arithmetic Operations
	        int addition = a + b;
	        int subtraction = a - b;
	        int multiplication = a * b;
	        int division = a / b;
	        int modulus = a % b;

	        System.out.println("Addition: " + addition);
	        System.out.println("Subtraction: " + subtraction);
	        System.out.println("Multiplication: " + multiplication);
	        System.out.println("Division: " + division);
	        System.out.println("Modulus: " + modulus);

	        // Assignment Operations
	        int x = a; // copy of a for demonstration
	        x += b;
	        System.out.println("After x += b: " + x);

	        x = a;
	        x -= b;
	        System.out.println("After x -= b: " + x);

	        x = a;
	        x *= b;
	        System.out.println("After x *= b: " + x);

	        x = a;
	        x /= b;
	        System.out.println("After x /= b: " + x);

	        x = a;
	        x %= b;
	        System.out.println("After x %= b: " + x);
		}
		}
