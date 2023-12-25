import java.util.Scanner;

public class FibonacciSeriesGenerator {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		System.out.println("Fibonacci series up to "+ n + " terms:");
		
		int firstTerm = 0, secondTerm = 1;
		
		for (int i=0; i < n ; i++) {
			System.out.println(firstTerm + " ");
			
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
		sc.close();
	}
}
