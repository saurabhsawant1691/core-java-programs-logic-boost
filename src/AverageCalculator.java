import java.util.Scanner;

public class AverageCalculator {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		System.out.println("Enter the elements of the array: ");
		
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		
		sc.close();
		
		int sum = 0;
		for (int number : array) {
			sum += number;
		}
		
		if (array.length > 0) {
			double average = (double) sum / array.length;
			System.out.println("The average is: " + average);
		} else {
			System.out.println("Cannot calculate average. The set is empty.");
		}
	}
}
