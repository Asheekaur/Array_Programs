package ArraysPrograms;

import java.util.*;

public class Selection_Sort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of Elements : ");
		int n = scan.nextInt();
		System.out.print("Enter the Elements : ");
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.print("Entered Array is : ");
		for (int elem : arr) {
			System.out.print(elem + " ");
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.print("Sorted Array is : ");
		for (int array : arr) {
			System.out.print(array + " ");
		}
		scan.close();
	}

}
