package Java_Programming_Assessment;

import java.util.Scanner;

public class Challenge10 {
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 2 number");
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
		try {
			
			int number1 = Integer.parseInt(input1);
			int number2 = Integer.parseInt(input2);
			 System.out.print("Enter an operator (+, -, *, /): ");
		        char operator = sc.next().charAt(0);
		        double result;
			switch (operator ) {
		    case '+':
		    	
		    	result = number1 + number2;
		        System.out.println(result);
		        break;
		    case '-':
		    	result = number1 - number2;
		        System.out.println(result);
		        break;
	        case '*':
	        	 result = number1 * number2;
		        System.out.println(result);
	            break;
	        case '/':
	        	if(number2==0)
	        	{
	        		System.out.print("number 2 is not divisible by 2");
	        	}
	        	else
	        	{
	        		 result = number1 / number2;
			        System.out.println(result);
	        	}
	            break;
	    default:
	        System.out.print("Invalid operator. Please enter one of +, -, *, /.");
	        break;
	}
		}
			catch(NumberFormatException e)
			{
				System.out.print("Invalid input. Please enter numeric values only.");
			}

}
}
