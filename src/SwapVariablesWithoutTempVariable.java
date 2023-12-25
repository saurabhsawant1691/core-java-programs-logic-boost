import java.util.Scanner;

public class SwapVariablesWithoutTempVariable {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int number1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int number2 = sc.nextInt();
		
		System.out.println("Before swapping: First Number= " + number1 + " Second Number= " + number2);
		
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		
		System.out.println("After swapping: First Number= " + number1 + " Second Number= " + number2);
		sc.close();
	}
}
