import java.util.Scanner;

public class SmallestNumberInArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		System.out.println("Enter the elements of thar array: ");
		
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		
		if (array.length == 0) {
			throw new IllegalArgumentException("Array is empty");
		}
		
		int smallestElement = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] < smallestElement) {
				smallestElement = array[i];
			}
		}
		
		System.out.println("The smallest element in the array is: "+ smallestElement);
	}
}
