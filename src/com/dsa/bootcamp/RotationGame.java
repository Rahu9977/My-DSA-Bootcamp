package com.dsa.bootcamp;

import java.util.Scanner;
/*
 * 
 * Given an integer array A of size N and an integer B, you have to print the same array after rotating it B times towards the right.


Input Format
There are 2 lines in the input

Line 1: The first number is the size N of the array A. Then N numbers follow which indicate the elements in the array A.

Line 2: A single integer B.


Output Format
Print array A after rotating it B times towards the right.

Example Input
Input 1 :
4 1 2 3 4
2


Example Output
Output 1 :
3 4 1 2


Example Explanation
Example 1 :

N = 4, A = [1, 2, 3, 4] and B = 2.

Rotate towards the right 2 times - [1, 2, 3, 4] => [4, 1, 2, 3] => [3, 4, 1, 2]

Final array = [3, 4, 1, 2]
 */
public class RotationGame {
	public static void main(String[] args) {
		int Array[] = { 1, 2, 3, 4, 5 };
		int N = Array.length;
		Scanner sc = new Scanner(System.in);

		// System.out.print("enter k:");
		int k = sc.nextInt();
		 int K = 2;

//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] Array = new int[n];
//
//		for (int i = 0; i < Array.length; i++) {
//			//System.out.println("Please enter number");
//			Array[i] = sc.nextInt();
//		}
//		int k = sc.nextInt();
		rotate(Array, k);
		for (int a : Array) {
			System.out.print(a +" ");
		}
	}

	public static void rotate(int[] nums, int k) {
		k = k % nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}

	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static void reverse(int[] nums, int left, int right) {
		while (left < right) {
			swap(nums, left, right);
			left++;
			right--;
		}
	}
}
