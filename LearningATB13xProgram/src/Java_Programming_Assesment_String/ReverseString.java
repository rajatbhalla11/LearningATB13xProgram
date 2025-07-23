package Java_Programming_Assesment_String;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
	       
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a string to reverse");
	      String str = sc.nextLine();
	       String Rstr = "";
	       for(int i = str.length()-1;i>=0;i--)
	       {
	           Rstr = Rstr + str.charAt(i);
	       }
	      System.out.println(Rstr);
	       }
	    }

