package ArraysPrograms;

import java.util.Scanner;

public class Duplicate_Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of elemnts in an array : ");
		int num = scan.nextInt();
		int[] arr = new int[num];
		
		System.out.println("Enter elemnts : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicates in an array : " + arr[i]);
				}
			}
		}

	}

}
