package ArraysPrograms;

import java.util.Scanner;

public class Quick_Sort {
	
	int partition(int arr[], int start, int end) {
		int pivot = arr[end];
		int i = (start - 1);
		for(int j = start ; j < end ; j++) {
			if(arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp; 
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[end];
		arr[end] = temp;
		
		return i+1;
	}
	
	void quick(int arr[], int start , int end){
		if(start<end) {
			int p = partition(arr,start,end);
			quick(arr,start,p-1);
			quick(arr,p+1,end);
		}
	}
	
	
	void printArr(int arr[], int num){
		int i ;
		for(i = 0 ; i < num ; i++) {
			System.out.print(arr[i]+ " ");
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

		Quick_Sort q1 = new Quick_Sort();
		System.out.print("Before sorting the array elements : ");
		q1.printArr(arr, num);
		q1.quick(arr, 0, num - 1);
		System.out.print("After sorting the array elements : ");
		q1.printArr(arr, num);
	}
}
