import java.util.Scanner;

public class PowerOfTheNumberCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base: ");
		double base = sc.nextDouble();
		
		System.out.println("Enter the exponent: ");
		int exponent = sc.nextInt();
		
		double result = 1;
		
		for (int i = 0; i < Math.abs(exponent); i++) {
			result *= base;
		}
		
		if (exponent < 0) {
			result = 1 / result;
		}
		
		System.out.println("Result: " + result);
		
		sc.close();
	}
}
