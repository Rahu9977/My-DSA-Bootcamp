package com.dsa.bootcamp;

import java.util.Arrays;

public class ReveseElements {
	public static void main(String[] args) {
		int[] arr = { 3, 2, -1, 6, 7, 3, 1, 9 };
		int l = 0;
		System.err.println("befor : " + Arrays.toString(arr));
		int r = arr.length-1;
		
		while (l < r) {
			swap(arr[l], arr[r]);
			
			l++;
			r--;
			
		}
		//System.err.println("afetr : " + Arrays.toString(arr));
	}

	public static void swap(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.err.print(a);
		//System.err.println(b);
		
	}
//	public static void swap(int a, int b) {
//		a = a + b;
//		b = a - b;
//		a = a - b;
//	}
//	public static void swap(int a, int b) {
//		int temp = a;
//		a = b;
//		b = temp;
//	}
}
