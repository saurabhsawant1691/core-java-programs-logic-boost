import java.util.Scanner;

public class FactorialCalculator {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		long factorial=1;
		
		for (int i =1; i <= number; i++) {
			factorial *= i;
		}
		System.out.println("Factorial is " + factorial);
		sc.close();
	}
}
