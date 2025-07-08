package Java_Programming_Assessment;
import java.util.*;
public class Challenge05 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        int a = scanner.nextInt();
        double b = scanner.nextDouble();

        int expressionResult = a + (int)b * 2 - 4;
        double implicitCasting = a + b;
        int explicitCasting = a + (int)b;

        System.out.println("Expression result: " + expressionResult);
        System.out.println("Implicit casting (int + double): " + implicitCasting);
        System.out.println("Explicit casting (int + (int)double): " + explicitCasting);
}
}
