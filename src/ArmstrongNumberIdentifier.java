import java.util.Scanner;

public class ArmstrongNumberIdentifier {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = sc.nextInt();
		
		int originalNumber = number;
		int numberOfDigits = String.valueOf(number).length();
		int sum = 0;
		
		while (number > 0) {
			int digit = number % 10;
			sum += Math.pow(digit, numberOfDigits);
			number /= 10;
		}
		
		if (sum == originalNumber) {
			System.out.println(originalNumber + " is an Armstriong Number.");
		}else {
			System.out.println(originalNumber + " is not an Armstrong Number.");
		}
		
		sc.close();
	}
}
