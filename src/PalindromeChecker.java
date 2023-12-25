import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		String decimalString = String.valueOf(number);
		int decimalLeft = 0;
		int decimalRight = decimalString.length() - 1;
		boolean isDecimalPalindrome = true;
		
		while(decimalLeft < decimalRight) {
			if (decimalString.charAt(decimalRight) != decimalString.charAt(decimalRight)){
				isDecimalPalindrome = false;
				break;
			}
			decimalLeft++;
			decimalRight--;
		}
		
		if(isDecimalPalindrome) {
			System.out.println(number + " is a palindrome in decimal representation.");
		} else {
			System.out.println(number + " is not a palindrome in decimal representation.");
		}

		String binaryString = Integer.toBinaryString(number);
        int binaryLeft = 0;
        int binaryRight = binaryString.length() - 1;
        boolean isBinaryPalindrome = true;

        while (binaryLeft < binaryRight) {
            if (binaryString.charAt(binaryLeft) != binaryString.charAt(binaryRight)) {
                isBinaryPalindrome = false;
                break;
            }
            binaryLeft++;
            binaryRight--;
        }

        if (isBinaryPalindrome) {
            System.out.println(number + " is a palindrome in binary representation.");
        } else {
            System.out.println(number + " is not a palindrome in binary representation.");
        }
	}
}
