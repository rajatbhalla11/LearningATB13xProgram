package Java_Programming_Assessment;

import java.util.Scanner;

public class Challenge09 {
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		String input = sc.nextLine();
		
		try {
			
			int days = Integer.parseInt(input);
			switch (days) {
		    case 1:
		        System.out.println("Monday");
		        break;
		    case 2:
		    	System.out.println("Tuesday");
		        break;
	        case 3:
	            System.out.println("Wednesday");
	            break;
	        case 4:
	        	System.out.println("Thursday");
	            break;
	            case 5:
	    	    	System.out.println("Friday");
	    	        break;
	            case 6:
	                System.out.println("Saturday");
	                break;
	            case 7:
	            	System.out.println("Sunday");
	                break;    
	   
	    default:
	        System.out.print("Enter a valid input day");
	        break;
	}
		}
			catch(NumberFormatException e)
			{
				System.out.print("Enter a numeric input");
			}
}
}
