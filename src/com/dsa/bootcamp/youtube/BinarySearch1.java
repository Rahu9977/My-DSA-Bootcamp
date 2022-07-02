package com.dsa.bootcamp.youtube;

//work with sorted array only 
//	accending and desanding

//1. find mind element
//2.if target element is greater tahn mid search in the right else searchin left
//3.if middle element == target elementS
	
public class BinarySearch1 {
	public static void main(String[] args) {
		int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
		int target = 22;
		int ans  = binarySearch(arr, target);
		System.out.println(ans); //9

	}

	static int binarySearch(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			// find minddle element
			//int mid = (start + end) / 2; // might bi possible that (start + end) exceed the range of int

			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (mid > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
