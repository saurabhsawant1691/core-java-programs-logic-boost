import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String: ");
		String string1 = sc.nextLine();
		System.out.println("Enter Second String:");
		String string2 = sc.nextLine();
		sc.close();
		
		string1 = string1.replaceAll("\\s", "").toLowerCase();
		string2 = string2.replaceAll("\\s", "").toLowerCase();
		
		if (string1.length() != string2.length()) {
			System.out.println(string1 + " and " + string2 + " are not anagrams.");
			return;
		}
		
		char[] charArray1 = string1.toCharArray();
		char[] charArray2 = string2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		if(Arrays.equals(charArray1, charArray2)) {
			System.out.println(string1 + " and " + string2 + " are anagrams.");
		} else {
			System.out.println(string1 + " and " + string2 + "are not anagrams.");
		}
	}
}
