package Java_Programming_Assesment_String;

public class Challenge01 {

	public static void main(String[]args)
	{
		
	String str = "Hello World";
	
	String str1 = str + " Welcome to the world of Java"; 
	
	int length = str.length();
	
	char charExtraction = str.charAt(0);
	
	String str2 = str.substring(6,length);
	
	System.out.println("Concatanation: " + str1 + ", Length: " + length + ", First char: " + charExtraction + ", Substring: " + str2);
}
}