package com.dsa.bootcamp.myrecursive;

import java.util.Arrays;
import java.util.LinkedList;

public class ReverseArray {
	static void rvereseArray(int arr[], int start, int end) {
		int temp;
		if (start >= end)
			return;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		rvereseArray(arr, start + 1, end - 1);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println("array is " + Arrays.toString(arr));
		rvereseArray(arr, 0, 5);
		System.out.println("Reversed array is " + Arrays.toString(arr));
		
	}
}
//tc : O(n)