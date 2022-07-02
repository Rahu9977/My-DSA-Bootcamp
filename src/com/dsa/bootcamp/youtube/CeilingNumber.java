package com.dsa.bootcamp.youtube;


/* 
 *  arr[] ={2,3,5,9,14,16,18}
 *  target = 15
 *  Ceiling number means => smallest element in array
 *  greater or equal target 
 *  exa : target = 15 => we have 16,18 is greater num
 *  but we want smaller + greater
 *  so ans is 16
 *  
 *  ======================================
 *  if not exist in given target thn pick next samllest number
 *  exa : target = 4 => ans : 5
 *  
 *  ============================
 *  exa : target = 9 => ans : 9
 *  
 *  ceiling = greater or equall = target
 * 
 * 
 * if ask for floor number 
 * exa : target = 15 => ans = 14
 * floor => greatest number , smaller or target 
 * 
 * */
public class CeilingNumber {
	
	public static void main(String[] args) {

		int[] arr= {2,3,5,9,14,16,18};
		int ans = ceiling(arr, 15);
		System.err.println(ans); //5
	}
	static int ceiling(int[] arr, int target) {
		
		if(target > arr.length-1) {
			return -1;
		}
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
		return start;
	}

}
