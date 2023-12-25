import java.util.Scanner;

public class ReverseGivenInteger {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to want to reverse: ");
		int number = sc.nextInt();
		sc.close();
//		String numStr = Integer.toString(number);
//		StringBuilder reversedStr = new StringBuilder(numStr).reverse();
//		int reversedNum = Integer.parseInt(reversedStr.toString());
//		System.out.println("Reversed Number: " + reversedNum);
		
		int reversedNum = 0;
		while (number !=0) {
			int digit = number % 10;
			reversedNum = reversedNum * 10 + digit;
			number/=10;
		}
		System.out.println("Reversed Number: " + reversedNum);
	}
}
