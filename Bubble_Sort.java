package ArraysPrograms;

import java.util.Scanner;

public class Bubble_Sort {

	void bubble(int arr[]) {
		for (int i = 0; i < arr.length - 1 ; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	void printArr(int arr[], int num) {
		int i;
		for (i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter number of elemnts in an array : ");
		int num = scan.nextInt();
		int[] arr = new int[num];

		System.out.println("Enter elemnts : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		Bubble_Sort b1 = new Bubble_Sort();
		System.out.print("Before sorting the array elements : ");
		b1.printArr(arr, num);
		b1.bubble(arr);
		System.out.print("After sorting the array elements : ");
		b1.printArr(arr, num);
	}

}
