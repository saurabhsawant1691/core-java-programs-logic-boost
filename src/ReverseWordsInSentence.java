import java.util.Scanner;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String sentence = sc.nextLine();
		String[] words = sentence.split(" ");
		
		System.out.println("Reversed sentence: ");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
		
		sc.close();
	}
}
