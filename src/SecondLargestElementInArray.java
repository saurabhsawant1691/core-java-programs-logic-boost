import java.util.Scanner;

public class SecondLargestElementInArray {

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
		
		if (array.length < 2) {
			System.out.println("Array should have at least two elements.");
			return;
		}
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for (int num : array) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			}
		}
		
		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("No second-largest element found");
		}else {
			System.out.println("The second-largest element in the array is: " + secondLargest);
		}
	}
}
