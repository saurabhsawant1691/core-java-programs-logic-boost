import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateElementsFromArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entr the size of the array: ");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		System.out.println("Enter the elements of the array: ");
		
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		
		if (array.length == 0) {
			throw new IllegalArgumentException("Array is empty");
		}
		
		System.out.println("Original Array:");
		printArray(array);
		
		Arrays.sort(array);
			
		int n = array.length;
		
		if (n == 0 || n == 1) {
			System.out.println("\nArray after removing duplicate elements:");
			printArray(array);
		}
		
		int j = 0;
		
		for(int i = 0; i < n - 1; i++) {
			if (array[i] != array[i + 1]) {
				array[j++] = array[i];
			}
		}
		
		array[j++] = array[n - 1];
		
		System.out.println("\nArray after removing duplicate elements: ");
		printArray(array, j);
	}
	
	private static void printArray(int[] arr, int length) {
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	private static void printArray(int[] arr) {
		for (int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
	
	
}
