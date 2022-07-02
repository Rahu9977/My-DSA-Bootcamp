package com.dsa.bootcamp.youtube;


/* 
 *  arr[] ={2,3,5,9,14,16,18}
 *  target = 15
 * 
 * 
 * if ask for floor number 
 * exa : target = 15 => ans = 14
 * floor => greatest number , smaller or target 
 * 
 * */
public class FlooringNumber {
	public static void main(String[] args) {

		int[] arr= {2,3,5,9,14,16,18};
		int ans = flooring(arr, 15);
		System.err.println(ans); //4
	}
	static int flooring(int[] arr, int target) {
		int start =0;
		int end = arr.length;
		
		while(start <= end) {
			int mid =  start + (end - start ) / 2;
			if(target < arr[mid]) {
				end = mid-1;
			}else if(target > arr[mid]) {
				start = mid+1;
			}else {
				return mid;
			}
		}
		return end;
	}


}
