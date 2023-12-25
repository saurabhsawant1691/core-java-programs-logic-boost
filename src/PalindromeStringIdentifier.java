import java.util.Scanner;

public class PalindromeStringIdentifier {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String  str = sc.nextLine();
		sc.close();
		
		int left = 0;
		int right = str.length() - 1;
		
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				System.out.println(str + " is not a palindrome.");
				return;
			}
			left++;
			right--;			
		}
		System.out.println(str + " is a palindrome.");
	}
}