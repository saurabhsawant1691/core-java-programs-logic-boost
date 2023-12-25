import java.util.Scanner;

public class LargestElementInArray {	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int[] userArray = new int[size];
		System.out.println("Enter the elements of the array: ");
		
		for (int i = 0; i< size; i++) {
			userArray[i] = sc.nextInt();	
		}
		sc.close();
		
		if (userArray.length == 0) {
			throw new IllegalArgumentException("Array is empty");
		}
		
		int largestElement = userArray[0];
		
		for (int i = 1; i < userArray.length; i++) {
			if (userArray[i] > largestElement) {
				largestElement = userArray[i];
			}
		}
		
		System.out.println("The largest element in the array is : " +largestElement);
	}	
}
