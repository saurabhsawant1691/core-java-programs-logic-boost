import java.util.Scanner;

public class GCDCalculator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int number1 = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int number2 = sc.nextInt();
		
		int gcd = 1;
		for (int i = 1; i <= number1 && i <= number2; ++i) {
			if (number1 % i == 0 && number2 % i == 0) {
				gcd = i;
			}
		}
		
		System.out.println("The Greatest Common Divisor (GCD) of " + number1 + " and " + number2 + " is: " + gcd);
		sc.close();
	}
}
