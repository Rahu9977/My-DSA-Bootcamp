package com.dsa.bootcamp.myrecursive;

public class SumOfArrayElements {

	// Iterative approach to calculate sum

	private int calculateSum(int[] arr) {
		int sum = 0;

		// Add each array element to sum variable
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		// return final result
		return sum;
	}

	private static int calculateSum(int arr[], int n) {
		// base or terminating condition
		if (n <= 0) {  // n==0 return 0 or arr[0]
			return 0;
		}
		// Calling method recursively
//		arr[i] + sum(arr, i-1);
		return calculateSum(arr, n - 1) + arr[n - 1];
	}

	public static void main(String[] args) {
		int arr[] = { 2, 5, 6, 8, 9, 12 };
		int sum = calculateSum(arr, arr.length);
		System.out.println(sum);
		findRange(arr,3);
	}
	
	//stat and end index for subarray
	private static void findRange(int arr[], int k) {
		for (int i = 0; i < arr.length-k; i++) {
			int s = i;
			int e = k+i-1;
			System.err.println(s +" :: "+e);		
		}
	}
	
}
