import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		int sum = 0;
		int tempNumber = number;
		
		while(tempNumber != 0) {
			int digit = tempNumber % 10;
			
			sum += digit;
			
			tempNumber /= 10;
		}
		
		System.out.println("The sum of digits in the number " + number + " is: " + sum);
		sc.close();
	}
}
