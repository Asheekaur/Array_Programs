package ArraysPrograms;
import java.util.*;

public class Subset_Array {
	
	public static boolean isSubArray(int arr1[], int arr2[], int n, int m) {
		int i = 0;
		int j = 0;
		while (i < n && j < m) {
			if (arr1[i] == arr2[j]) {
				i++;
				j++;
				if (j == m)
					return true;
			} else {
				i = i - j + 1;
				j = 0;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number of elements for Array1 : ");
		int x = scan.nextInt();
		
		System.out.print("Enter the elements for Array1 : ");
		int arr1[] = new int[x];
		int n = arr1.length;
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = scan.nextInt();
		}
		
		System.out.print("Enter Array1 : ");
		for (int elem1 : arr1) {
			System.out.print(elem1 + " ");
		}
		System.out.println();
		
		System.out.print("Enter the number of elements for Array2 : ");
		int y = scan.nextInt();
		
		System.out.print("Enter the elements for Array2 : ");
		int arr2[] = new int[y];
		int m = arr2.length;
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = scan.nextInt();
		}
		

		System.out.print("Entered Array2 : ");
		for (int elem2 : arr2) {
			System.out.print(elem2 + " ");
		}
		System.out.println();
		
		System.out.print("Array2 is a sub Array of Array1 : ");
		if (isSubArray(arr1, arr2, n, m)) {
			System.out.print("YES");
		} else {
			System.out.print("NO");
		}

		scan.close();
	}

}
