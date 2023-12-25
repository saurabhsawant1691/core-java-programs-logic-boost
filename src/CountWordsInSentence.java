import java.util.Scanner;

public class CountWordsInSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence =sc.nextLine();
		sc.close();
		
		int numberOfWords = sentence.split("\\s").length;
		System.out.println("Number of words in the sentence: " + numberOfWords);
	}
}
