package com.dsa.bootcamp.youtube;

//binary serach in accending and desanding order

public class OrderAgnosticBs {

	public static void main(String[] args) {
		int[] arr= {90,75,18,12,6,4,3,1};
		int ans = OrderAgnosticBinarySearch(arr, 12);
		System.err.println(ans); //3
	}
	
	static int OrderAgnosticBinarySearch(int[] arr ,int target) {
		int start =0;
		int end = arr.length-1;
		
		//find wether the aray is sorted in accending or desanding
		boolean isAsc;
		if(arr[start] < arr[end]) {
			isAsc =true;
		}else {
			isAsc= false;	
		}
//		or use
//		boolean isAsc = arr[start] < arr[end];
		
		while(start <=end) {
			int mid = start + (end  - start) / 2 ;
			if(arr[mid] == target) {
				return mid;
			}
			if(isAsc) {
				if(target < arr[mid]) {
					end = mid -1;
				}else {
					start = mid +1;
				}
			}else {
				if(target > arr[mid]) {
					end = mid-1;
				}else {
					start =mid +1;
				}
			}
		}
		return -1;
	}
	
}
