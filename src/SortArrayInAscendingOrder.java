import java.util.Arrays;
import java.util.Scanner;

public class SortArrayInAscendingOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		System.out.println("Enter the elements of the array: ");
		
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		
		System.out.println("Original array: " + Arrays.toString(array));
		
		Arrays.sort(array);
		
		System.out.println("Sort array in ascending order: " + Arrays.toString(array));
	}
}
